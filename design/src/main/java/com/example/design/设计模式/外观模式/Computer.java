package com.example.design.设计模式.外观模式;

/**
 * @author pengjian
 * @since 2022-03-03
 */
public class Computer
{

    private CPU cpu;
    private Disk disk;

    public Computer() {
        this.cpu = new CPU();
        this.disk = new Disk();
    }


    public void startup(){
        System.out.println("start the computer!");
        cpu.startup();
        disk.startup();
        System.out.println("start computer finished!");
    }

    public void shutdown(){
        System.out.println("begin to close the computer!");
        cpu.shutdown();
        disk.shutdown();
        System.out.println("computer closed!");
    }

}
