package com.example.design.设计模式.抽象工厂模式;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }

}
