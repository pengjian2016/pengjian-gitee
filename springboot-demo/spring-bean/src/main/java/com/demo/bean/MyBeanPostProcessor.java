package com.demo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * TODO
 *
 * @author pengjian
 * @since 2023-02-17
 */
public class MyBeanPostProcessor  implements BeanPostProcessor {


    public MyBeanPostProcessor() {
        super();
        System.out.println("0 这是BeanPostProcessor实现类构造器！！");
    }

    @Override
    public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
        System.out.println("3 BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改！");
        return arg0;
    }

    @Override
    public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
        System.out.println("5  BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改！");
        return arg0;
    }


}