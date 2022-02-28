package com.pengjian.edu.controller;

import javax.annotation.Resource;
import javax.validation.constraints.Min;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.pengjian.edu.common.AjaxResult;
import com.pengjian.edu.pojo.Role;
import com.pengjian.edu.service.IRoleService;

/**
 * @author MRT
 * @date 2022/2/12 17:14
 */
@RestController
@Validated
@RequestMapping("/role")
public class RoleController {
    @Resource
    private IRoleService roleServiceImpl;

    /**
     * 新增角色
     * @param role 新增角色
     * @return 响应
     */
    @PostMapping("/addRole")
    @SaCheckLogin
    public AjaxResult addRole(@Validated @RequestBody Role role){
        roleServiceImpl.addRole(role);
        return AjaxResult.success("添加成功！");
    }

    /**
     *  获取角色
     * @return 响应
     */
    @SaCheckLogin
    @GetMapping("/getAllRole")
    public AjaxResult getAllRoles(){
        return AjaxResult.success("获取成功",roleServiceImpl.getAllRoles());
    }

    /**
     * 删除角色
     * @param roleId 角色编号
     * @return 响应
     */
    @GetMapping("/deleteRole")
    @SaCheckLogin
    public AjaxResult deleteRole(@Min(value = 1L, message = "编号必须大于 0") Long roleId){
        roleServiceImpl.deleteRole(roleId);
        return AjaxResult.success("删除成功！");
    }

    /**
     * 更新角色
     * @param roleId 角色编号
     * @param roleName 角色名称
     * @param remark 备注
     * @return 响应
     */
    @PostMapping("/updateRole")
    public AjaxResult updateRole(@RequestParam Long roleId,
                                 @RequestParam String roleName,
                                 @RequestParam String remark){
        roleServiceImpl.update(roleId,roleName,remark);
        return AjaxResult.success("更新成功");
    }
}
