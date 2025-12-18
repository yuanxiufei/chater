package com.imooc.interfacedemo;

/**
 * 接口的继承
 */
public interface AirPlane extends Vehicle , VehicleSupplement{
    /**
     * 接口继承的接口有重名的方法，那就需要重写这个方法
     */
    @Override
    default void drive() {
        System.out.println("AirPlane重写两个接口的重名方法");
    }
}
