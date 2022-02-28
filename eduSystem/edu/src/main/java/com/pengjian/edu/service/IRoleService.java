package com.pengjian.edu.service;


import java.util.List;

import com.pengjian.edu.pojo.Role;

/**
 * @author MRT
 * @date 2022/2/12 16:33
 */
public interface IRoleService {
    /**
     * 添加角色
     * @param role 新增角色信息
     */
    void addRole(Role role);

    /**
     * 删除角色
     * @param roleId 删除角色信息
     */
    void deleteRole(Long roleId);

    /**
     * 更新角色信息
     * @param roleId 更新新角色信息
     * @param roleName 更新新角色信息
     * @param remark 更新新角色信息
     */
    void update(Long roleId,String roleName,String remark);

    /**
     * 查询全部角色
     * @return
     */
    List<Role> getAllRoles();
}
