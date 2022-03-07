package com.gitee.mybatis.start;

import java.util.Set;

import com.gitee.mybatis.generator.Generator;

/**
 * 功能描述：自动化生成代码接口
 * @author:Hujifang
 */
public interface GeneratorStarter {

    /**
     * 启动创建代码
     */
    void start(Set<Generator> generatorSet);
}
