package com.demo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * TODO
 *
 * @author pengjian
 * @since 2023-02-17
 */
public class Person  implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

    private String name;
    private String address;
    private String phone;

    private BeanFactory beanFactory;
    private String beanName;

    public Person() {
        System.out.println("0【构造器】调用Person的构造器实例化");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("1【注入属性】注入属性name");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("1【注入属性】注入属性address");
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        System.out.println("1【注入属性】注入属性phone");
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person [address=" + address + ", name=" + name + ", phone=" + phone + "]";
    }


    // 这是BeanNameAware接口方法
    @Override
    public void setBeanName(String arg0) {
        System.out.println("2【BeanNameAware接口】调用BeanNameAware.setBeanName()");
        this.beanName = arg0;
    }
    // 这是BeanFactoryAware接口方法
    @Override
    public void setBeanFactory(BeanFactory arg0) throws BeansException {
        System.out.println("2【BeanFactoryAware接口】调用BeanFactoryAware.setBeanFactory()");
        this.beanFactory = arg0;
    }


    // 这是InitializingBean接口方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("4【InitializingBean接口】调用InitializingBean.afterPropertiesSet()");
    }
    // 通过<bean>的init-method属性指定的初始化方法
    public void myInit() {
        System.out.println("4【init-method】调用<bean>的init-method属性指定的初始化方法");
    }




    // 这是DiposibleBean接口方法
    @Override
    public void destroy() throws Exception {
        System.out.println("6【DiposibleBean接口】调用DiposibleBean.destory()");
    }

    // 通过<bean>的destroy-method属性指定的初始化方法
    public void myDestory() {
        System.out.println("6【destroy-method】调用<bean>的destroy-method属性指定的初始化方法");
    }

}