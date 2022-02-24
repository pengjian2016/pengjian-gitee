package com.example.design.设计模式.中介者模式;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public class MyMediator  implements Mediator{

    private User1 user1;
    private User2 user2;

    @Override
    public void createMediator() {
        user1 = new User1();
        user2 = new User2();
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }

    public User1 getUser1() {
        return user1;
    }

    public void setUser1(User1 user1) {
        this.user1 = user1;
    }

    public User2 getUser2() {
        return user2;
    }

    public void setUser2(User2 user2) {
        this.user2 = user2;
    }
}
