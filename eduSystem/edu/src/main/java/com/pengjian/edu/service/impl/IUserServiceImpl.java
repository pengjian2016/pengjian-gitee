package com.pengjian.edu.service.impl;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import cn.dev33.satoken.secure.SaSecureUtil;
import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.util.IdUtil;
import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pengjian.edu.common.exception.OperationFailException;
import com.pengjian.edu.common.exception.UserServiceException;
import com.pengjian.edu.common.utils.WrapperUtils;
import com.pengjian.edu.mapper.UserMapper;
import com.pengjian.edu.pojo.TUser;
import com.pengjian.edu.service.IUesrService;
import com.pengjian.edu.vo.UserUpdateVo;

/**
 * @author MRT
 * @date 2022/2/11 17:43
 */
@Service
public class IUserServiceImpl implements IUesrService {

    @Resource
    private UserMapper userMapper;
    /**
     * 添加用户
     *
     * @param user 用户信息
     */
    @Override
    public void addUser(TUser user) {
        // 先查询用户是否存在
        if(userMapper.selectCount(new QueryWrapper<TUser>().eq("user_name", user.getUserName())) != 0){
            throw new UserServiceException("用户名已存在");
        }
        // 生成盐值
        user.setSalt(IdUtil.simpleUUID());
        // 生成密码
        user.setPassword(encodePassword(user.getPassword(),user.getSalt()));
        // 不存在就继续添加
        if(1 != userMapper.insert(user)){
            throw new OperationFailException("添加用户名操作失败");
        }
    }

    /**
     * 删除用户
     *
     * @param userId 用户id
     */
    @Override
    public void deleteUser(Long userId) {
        if(userMapper.selectCount(new QueryWrapper<TUser>().eq("user_id", userId)) != 1){
            throw new UserServiceException("用户不存在或者不唯一，无法删除");
        }
        if(userMapper.deleteById(userId) != 1){
            throw new UserServiceException("删除失败，请联系开发者");
        }

    }

    /**
     * 更新用户参数
     *
     * @param userUpdateVo 新的用户参数
     */
    @Override
    public void userUpdate(UserUpdateVo userUpdateVo) {
        TUser user = userMapper.selectOne(new QueryWrapper<TUser>().eq("user_name", userUpdateVo.getUserName()));
        if(user == null){
            throw new UserServiceException("用户不存在，无法更改信息");
        }
        user.setNickName(userUpdateVo.getNickName());
        user.setSex(userUpdateVo.getSex());
        user.setEmail(userUpdateVo.getEmail());
        user.setPhone(userUpdateVo.getPhone());
        if(!StringUtils.isEmpty(userUpdateVo.getPassword()) &&!encodePassword(userUpdateVo.getPassword(),user.getSalt()).equals(user.getPassword())){
            user.setPassword(encodePassword(userUpdateVo.getPassword(),user.getSalt()));
        }
        if(userMapper.update(user, new QueryWrapper<TUser>().eq("user_name", userUpdateVo.getUserName())) != 1){
            throw new UserServiceException("修改失败，联系开发者");
        }

    }

    /**
     * 用户登录
     *
     * @param userName 用户名
     * @param password 密码
     * @return token
     */
    @Override
    public SaTokenInfo login(String userName, String password) {
        TUser user = userMapper.selectOne(new QueryWrapper<TUser>().eq("user_name", userName));
        // 检查用户名
        if(user == null){
            throw new UserServiceException("用户不存在");
        }
        // 用户名与密码匹配
        if(!encodePassword(password,user.getSalt()).equals(user.getPassword())){
            throw new UserServiceException("用户名与密码不匹配");
        }
        StpUtil.login(user.getUserId());
        return StpUtil.getTokenInfo();
    }

    /**
     * 登出
     */
    @Override
    public void logout() {
        StpUtil.logout();
    }

    /**
     * 踢人下线
     *
     * @param userId 用户id
     */
    @Override
    public void kickUser(Long userId) {
        StpUtil.logout(userId);
    }

    /**
     * 获取在线用户
     *
     * @return 获取在线用户
     * @param username 用户名
     */
    @Override
    public List<TUser> getActiveUsers(String username) {
        // 筛选字段
        QueryWrapper<TUser> queryWrapper = WrapperUtils.withoutPasswdSalt();
        // 获取在线用户的id
        List<String> sessionsList = StpUtil.searchSessionId(null,-1,-1);
        List<Long> idList = new ArrayList<>();
        for (String str : sessionsList) {
            idList.add(Long.parseLong(str.substring(25)));
        }
        //插入id列表
        queryWrapper.in("user_id",idList);
        queryWrapper.like("user_name",username);
        return userMapper.selectList(queryWrapper);
    }

    /**
     * 获取全部员工
     *
     * @return 员工列表
     * @param username
     */
    @Override
    public List<TUser> getAllUsers(String username) {
        QueryWrapper<TUser> queryWrapper = WrapperUtils.withoutPasswdSalt();
        queryWrapper.like("user_name",username);
        // TODO: 也是泛型的问题
        return userMapper.selectList(queryWrapper);
    }

    /**
     * 获取本用户的信息
     *
     * @return 用户信息
     */
    @Override
    public TUser getMyInfo() {
        //TODO: 据说这里有点问题不知道怎么改，就这样放着，是工具类封装时泛型的问题
        QueryWrapper<TUser> queryWrapper = WrapperUtils.withoutPasswdSalt();
        queryWrapper.eq("user_id",StpUtil.getLoginIdAsLong());
        return userMapper.selectOne(queryWrapper);
    }

    /**
     * 密码加密
     * @param password 密码
     * @param salt 盐值
     * @return 加密后密码
     */
    private String encodePassword(String password, String salt){
       for(int i = 0 ; i < 3 ;i++){
           password = SaSecureUtil.md5(salt+password+salt);
       }
       return password;
    }
}
