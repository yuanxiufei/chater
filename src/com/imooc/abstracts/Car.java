package com.imooc.abstracts;

public class Car  extends Vehicle{

    /**
     * 重写充电方法
     */
    @Override
    public void drive() {
        System.out.println("Car在充电");
    }
    @Override
    public void charge() {
        System.out.println("Car在行驶");
    }
}
