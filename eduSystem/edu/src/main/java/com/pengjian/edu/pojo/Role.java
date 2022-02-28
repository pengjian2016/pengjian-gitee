package com.pengjian.edu.pojo;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * role
 * @author MRT
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {
    /**
     * 角色编号
     */
    @TableId(type = IdType.AUTO)
    private Long roleId;

    /**
     * 角色名
     */
    @NotBlank(message = "角色名不得为空")
    private String roleName;

    /**
     * 角色昵称
     */
    @NotBlank(message = "角色昵称不得为空")
    private String roleNickName;

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