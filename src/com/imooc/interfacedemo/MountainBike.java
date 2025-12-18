package com.imooc.interfacedemo;


public class MountainBike implements Vehicle {
    /**
     * 重写接口中的默认方法
     */
    @Override
    public void drive() {
        System.out.println("MountainBike，山地自行车，车胎宽，阻力大，山坡锻炼身体，下坡省油");
    }

    @Override
    public void speedUp() {

    }

    @Override
    public void speedDown() {

    }
}
