package com.imooc.interfacedemo;

public interface VehicleSupplement {
    /**
     * 抽象方法
     */
    void charge();
    default void drive(){
        System.out.println("VehicleSupplement默认行驶的方法");
    }
}
