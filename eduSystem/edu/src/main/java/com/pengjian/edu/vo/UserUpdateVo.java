package com.pengjian.edu.vo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MRT
 * @date 2022/2/13 13:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateVo {
    @NotBlank(message = "用户名不得为空")
    private String userName;
    @NotBlank(message = "昵称不得为空")
    private String nickName;
    //TODO: 枚举检验
    private Integer sex;
    @NotBlank(message = "邮箱不得为空")
    @Email
    private String email;
    @NotBlank(message = "手机号不得为空")
    private String phone;

    private String password;
}
