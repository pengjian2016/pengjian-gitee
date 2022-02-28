package com.pengjian.edu.pojo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * t_user
 * @author  MRT
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TUser implements Serializable {
    /**
     * 用户编号
     */
    @TableId(type = IdType.AUTO)
    private Long userId;

    /**
     * 用户名
     */
    @NotBlank(message = "用户名不得为空")
    private String userName;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 用户盐值
     */
    private String salt;

    /**
     * 用户密码
     */
    @NotBlank(message = "密码不得为空")
    private String password;

    /**
     * 用户性别
     */
    private Integer sex;

    /**
     * 用户手机号
     */
//    @Pattern(regexp = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$",message = "手机号有误")
    private String phone;

    /**
     * 用户email
     */
    @Email(message = "邮箱有误")
    private String email;

    /**
     * 状态：0正常（离线），1正常（在线），2暂时封禁，3永久封禁
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer status;

    /**
     * 最近一次登录IP
     */
    private String lastLoginIp;

    /**
     * 角色编号
     */
    private Long roleId;

    /**
     * 逻辑删除
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer isDeleted;

    /**
     * 创建者
     */
    @TableField(fill = FieldFill.INSERT)
    private Long createdBy;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createdTime;

    /**
     * 更新者
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateBy;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 乐观锁
     */
    @TableField(fill = FieldFill.INSERT)
    @Version
    private Integer version;

    /**
     * 备注
     */
    private String remark;
    private static final long serialVersionUID = 1L;
}