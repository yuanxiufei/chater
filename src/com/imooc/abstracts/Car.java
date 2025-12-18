package com.imooc.abstracts;

public class Car  extends Vehicle{

    /**
     * 重写充电方法
     */
    @Override
    public void drive() {
        System.out.println("car在充电");
    }

    /**
     * 重写行驶方法
     */
    @Override
    public void charge() {
        System.out.println("car在行驶");
    }
}
