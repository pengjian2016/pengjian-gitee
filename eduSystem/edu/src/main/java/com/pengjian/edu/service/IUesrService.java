package com.pengjian.edu.service;

import java.util.List;

import cn.dev33.satoken.stp.SaTokenInfo;
import com.pengjian.edu.pojo.TUser;
import com.pengjian.edu.vo.UserUpdateVo;

/**
 * @author MRT
 * @date 2022/2/11 17:42
 */
public interface IUesrService {
    /**
     * 添加用户
     * @param user 用户信息
     */
    void addUser(TUser user);

    /**
     * 删除用户
     * @param userId 用户id
     */
    void deleteUser(Long userId);

    /**
     * 更新用户参数
     * @param userUpdateVo 新的用户参数
     */
    void userUpdate(UserUpdateVo userUpdateVo);

    /**
     * 用户登录
     * @param userName 用户名
     * @param password 密码
     * @return token
     */
    SaTokenInfo login(String userName, String password);

    /**
     * 登出
     */
    void logout();

    /**
     * 踢人下线
     * @param userId 用户id
     */
    void kickUser(Long userId);

    /**
     * 获取在线用户
     * @return 在线用户列表
     * @param username 用户名
     */
    List<TUser> getActiveUsers(String username);

    /**
     * 获取全部员工
     * @return 员工列表
     * @param username 用户名模糊查询
     */
    List<TUser> getAllUsers(String username);

    /**
     * 获取本用户的信息
     * @return 用户信息
     */
    TUser getMyInfo();
}
