package com.pengjian.edu.controller;

import javax.annotation.Resource;
import javax.validation.constraints.Min;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import cn.dev33.satoken.annotation.SaCheckLogin;
import cn.dev33.satoken.stp.SaTokenInfo;
import com.pengjian.edu.common.AjaxResult;
import com.pengjian.edu.common.constants.Constants;
import com.pengjian.edu.pojo.TUser;
import com.pengjian.edu.service.IUesrService;
import com.pengjian.edu.vo.LoginVo;
import com.pengjian.edu.vo.UserUpdateVo;

/**
 * @author MRT
 * @date 2022/2/11 18:14
 */
@RestController
@Validated
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUesrService userService;

    /**
     * 用户登录
     * @param loginVo 登录信息
     * @return 带有token的响应
     */
    @PostMapping("/login")
    public AjaxResult login(@Validated @RequestBody LoginVo loginVo){
        SaTokenInfo token = userService.login(loginVo.getUsername(), loginVo.getPassword());
        return AjaxResult.success("登录成功").put(Constants.TOKEN_NAME,token.getTokenName()).put(Constants.TOKEN_VALUE,token.getTokenValue());
    }

    /**
     * 获取全部用户列表
     * @return 响应
     */
    @GetMapping("getUsers")
    @SaCheckLogin
    public AjaxResult getUsers(String username){
        if(username == null){
            username ="";
        }
        return AjaxResult.success("获取成功！").put("users", userService.getAllUsers(username));
    }

    /**
     * 用户登出
     * @return 登出响应
     */
    @SaCheckLogin
    @GetMapping("/logout")
    public AjaxResult logout(){
        userService.logout();
        return AjaxResult.success("登出成功");
    }


    /**
     * 踢人下线
     * @param userId 用户id
     * @return 踢出响应
     */
    @GetMapping("/kickUser")
    @SaCheckLogin
    public AjaxResult kickUser(@Min(value = 1L, message = "编号必须大于 0") Long userId){
        userService.kickUser(userId);
        return AjaxResult.success("踢出成功");
    }


    @GetMapping("/getActiveUserList")
    @SaCheckLogin
    public AjaxResult getActiveUserList(String username){
        if(username == null){
            username ="";
        }
        return AjaxResult.success("查询成功").put("users", userService.getActiveUsers(username));
    }

    /**
     * 添加用户
     * @param user 新用户
     * @return 响应
     */
    @PostMapping("/add")
    @SaCheckLogin
    public AjaxResult addUser(@Validated TUser user){
        userService.addUser(user);
        return AjaxResult.success("添加成功！");
    }

    /**
     * 删除用户
     * @param userId 用户编号
     * @return 删除响应
     */
    @SaCheckLogin
    @GetMapping("/deleteUser")
    public AjaxResult deleteUser(@Min(value = 1L, message = "编号必须大于 0") Long userId){
        userService.deleteUser(userId);
        return AjaxResult.success("删除成功");
    }

    /**
     * 更改用户数据
     * @param userUpdateVo 新的数据
     * @return 响应
     */
    @SaCheckLogin
    @PostMapping("/update")
    public AjaxResult updateUserInfo(@Validated UserUpdateVo userUpdateVo){
        userService.userUpdate(userUpdateVo);
        return AjaxResult.success("修改成功");
    }

    /**
     * 获取本用户的信息
     * @return 响应
     */
    @GetMapping("/info")
    @SaCheckLogin
    public AjaxResult getInfo(){
        return AjaxResult.success("获取成功！").put("user", userService.getMyInfo());
    }
}
