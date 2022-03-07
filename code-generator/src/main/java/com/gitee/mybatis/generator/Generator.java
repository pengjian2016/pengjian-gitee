package com.gitee.mybatis.generator;

import java.util.Map;

import com.gitee.mybatis.config.PackageConfigTypes;
import com.gitee.mybatis.generator.context.GeneratorContext;

/**
 * 功能描述：读取配置自动化生成代码接口
 */
public interface Generator {
    /**
     *模块的包配置类型
     */
    PackageConfigTypes getPackageConfigTypes();

    /**
     * 读取配置生成文件
     * @param context
     */
    void defaultGenerator(GeneratorContext context, Map<String, String> allPackageNameMap);

    /**
     * 读取配置生成文件
     * @param context
     */
    void pluginGenerator(GeneratorContext context, Map<String, String> allPackageNameMap);
}
