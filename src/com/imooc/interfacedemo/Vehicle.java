package com.imooc.interfacedemo;

/**
 * 接口
 * 不能实例化对象
 */
public interface Vehicle {
    // 1.接口中抽象方法系统会默认添加public abstract修饰符
    void  speedUp();
    void speedDown();
    // 2.接口中常态变量系统会默认添加public static final修饰符
    int minSpeed = 0;
    // 3.默认方法
    // 子类可以直接使用默认方法，也可以根据需要重写默认方法
    default void drive(){
        System.out.println("Vehicle默认行驶的方法");
    }
    default void brake(){
        System.out.println("Vehicle接口默认方法-刹车方法");
    }
    // 4.静态方法
    // 接口中的静态方法只能通过接口名调用不能被继承
    static void showSpeed(){
        System.out.println("静态方法-minSpeed=" + minSpeed);
    }

}
