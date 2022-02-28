package com.pengjian.edu.service.impl;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pengjian.edu.common.exception.RoleServiceException;
import com.pengjian.edu.mapper.RoleMapper;
import com.pengjian.edu.pojo.Role;
import com.pengjian.edu.service.IRoleService;

/**
 * @author MRT
 * @date 2022/2/12 16:37
 */
@Service
public class RoleServiceImpl implements IRoleService {

    @Resource
    private RoleMapper roleMapper;
    /**
     * 添加角色
     *
     * @param role 新增角色信息
     */
    @Override
    public void addRole(Role role) {
        // 检查roleName是否存在
        if(0 != roleMapper.selectCount(new QueryWrapper<Role>().eq("role_name",role.getRoleName()))){
            throw new RoleServiceException("角色已存在");
        }
        if(1 != roleMapper.insert(role)){
            throw new RoleServiceException("添加是被，请联系后台管理员");
        }
    }

    /**
     * 删除角色
     *
     * @param roleId 删除角色信息
     */
    @Override
    public void deleteRole(Long roleId) {
        if(0 == roleMapper.selectCount(new QueryWrapper<Role>().eq("role_id",roleId))){
            throw new RoleServiceException("角色不存在,无法删除");
        }
        roleMapper.deleteById(roleId);
    }

    /**
     * 更新角色信息
     *
     * @param roleName 更新新角色信息
     * @param roleId 更新新角色信息
     * @param remark 更新新角色信息
     */
    @Override
    public void update(Long roleId,String roleName,String remark) {
        Role role = roleMapper.selectById(roleId);
        if(null == role){
            throw new RoleServiceException("角色不存在,无法更改");
        }
        if(roleMapper.selectCount(new QueryWrapper<Role>().eq("role_name",roleName)) != 0){
            throw new RoleServiceException("角色已存在");
        }
        if (!StringUtils.isEmpty(roleName)){
            role.setRoleName(roleName);
        }
        if (!StringUtils.isEmpty(remark)){
            role.setRemark(remark);
        }
        roleMapper.updateById(role);
    }

    /**
     * 查询全部角色
     *
     * @return 全部角色信息
     */
    @Override
    public List<Role> getAllRoles() {
        return roleMapper.selectList(null);
    }
}
