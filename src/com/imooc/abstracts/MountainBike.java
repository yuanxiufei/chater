package com.imooc.abstracts;

public class MountainBike extends Bicyle{
    @Override
    public void drive() {
        System.out.println("MountainBike，车胎宽，阻力大，山坡锻炼身体，下坡省油");
    }

    @Override
    public void charge() {
        System.out.println("MountainBike在行驶");
    }
}
