package com.gitee.mybatis.generator.impl;

import com.gitee.mybatis.generator.base.BaseGeneratorImpl;
import com.gitee.mybatis.generator.context.GeneratorContext;
import org.apache.velocity.VelocityContext;

import java.util.UUID;

/**
 * 功能描述：Result代码生成
 */
public class ResultGeneratorImpl extends BaseGeneratorImpl {

    @Override
    public void initVelocityContext(VelocityContext velocityContext, GeneratorContext generatorContext) {
        super.initVelocityContext(velocityContext, generatorContext);
        velocityContext.put("SerialVersionUID", String.valueOf(UUID.randomUUID().getLeastSignificantBits()));
    }
}
