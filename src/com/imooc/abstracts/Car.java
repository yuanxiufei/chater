package com.imooc.abstracts;

public class Car  extends Vehicle{

    @Override
    public void drive() {
        System.out.println("车胎宽，阻力大，山路行驶");
    }
    @Override
    public void charge() {
        System.out.println("车胎宽，阻力大，山路行驶");
    }
}
