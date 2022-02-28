package com.pengjian.edu.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * permission
 * @author MRT
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Permission implements Serializable {
    /**
     * 权限编号
     */
    private Long permissionId;

    /**
     * 权限名
     */
    private String permissionName;

    /**
     * 逻辑删除
     */
    private Integer isDeleted;

    /**
     * 创建者
     */
    private Long createdBy;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新者
     */
    private Long updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 乐观锁
     */
    private Integer version;

    /**
     * 备注
     */
    private String remark;
    private static final long serialVersionUID = 1L;
}