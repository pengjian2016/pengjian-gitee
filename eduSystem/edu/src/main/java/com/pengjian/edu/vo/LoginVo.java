package com.pengjian.edu.vo;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MRT
 * @date 2022/2/12 1:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginVo {
    @NotBlank(message = "用户名不能为空")
    String username;
    @NotBlank(message = "密码不能为空")
    String password;
}
