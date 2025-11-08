package com.imooc.abstracts;

/**
 * 抽象类
 */
public abstract class Vehicle {

    /**
     * 1.有抽象方法的类，必须是抽象类
     * 2.抽象类可以没有抽象方法
     * 3.抽象类不能实例化对象，必须被子类继承
     */
    // 抽象方法
    public abstract void drive();
    // 充电的方法
    public abstract void charge();
    public void speedUp(){
        System.out.println("加速行驶");
    }
}
