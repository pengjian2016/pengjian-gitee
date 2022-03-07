package com.gitee.mybatis.generator.base;

import com.gitee.mybatis.generator.Generator;
import com.gitee.mybatis.start.DefaultGeneratorStarter;
import com.gitee.mybatis.start.PluginGeneratorStarter;

import java.util.Set;

/**
 * 功能描述：分发生成代码适配器
 */
public class GeneratorFactoryImpl {

    /**
     * 生成器集合
     */
    private Set<Generator> generatorSet;

    public void setGeneratorSet(Set<Generator> generatorSet) {
        this.generatorSet = generatorSet;
    }

    public void defaultGeneratorStarter() {
        DefaultGeneratorStarter defaultGeneratorStarter=new DefaultGeneratorStarter();
        defaultGeneratorStarter.start(generatorSet);
    }

    public void pluginGeneratorStarter() {
        PluginGeneratorStarter pluginGeneratorStarter=new PluginGeneratorStarter();
        pluginGeneratorStarter.start(generatorSet);
    }
}
