package com.pengjian.edu.common.handler;

import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;

/**
 * @author MRT
 * @date 2022/2/11 17:14
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        // 创建者信息
        // TODO: 这里需要改成创建者的ID
        this.setFieldValByName("createdBy",0L,metaObject);
        this.setFieldValByName("createdTime",DateUtil.date(),metaObject);
        // 更新者信息
        // TODO: 这里需要更改成在线用户的ID
        this.setFieldValByName("updateBy",0L,metaObject);
        this.setFieldValByName("updateTime",DateUtil.date(),metaObject);
        // 账户状态
        this.setFieldValByName("status",0,metaObject);
        // 乐观锁
        this.setFieldValByName("version",0,metaObject);
        // 账户状态
        this.setFieldValByName("isDeleted",0,metaObject);

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // 更新者信息
        // TODO: 这里需要更改成在线用户的ID
        this.setFieldValByName("updateBy",0L,metaObject);
        this.setFieldValByName("updateTime",DateUtil.date(),metaObject);
    }
}
