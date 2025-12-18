package com.imooc.interfacedemo;

/**
 * 接口的实现类
 * 继承使用：extends
 * 接口实现：implements
 * 1.非抽象类实现接口，必须重写所有的抽象方法
 * 2.一个类可以在继承父类的同时，实现多少个接口
 * 3.多个接口中有重名的抽象方法，只需重写一次
 * 4.多个接口中有重名的默认方法，必须重写默认方法
 * 5.父类成员方法和接口默认方法重名，子类执行父类的成员方法
 */
public class Car  extends LandVehicle implements Vehicle,VehicleSupplement {
    /**
     *重写默认方法，遵循就近原则
     */
    @Override
    public void drive() {
        Vehicle.super.drive();
        System.out.println("汽车正在马路狂奔");
    }

    @Override
    public void speedUp() {
        System.out.println("Vehicle加速行驶");
    }

    @Override
    public void speedDown() {
        System.out.println("Vehicle减速行驶");
    }

    @Override
    public void charge() {
        System.out.println("VehicleSupplement，汽车正在充电");
    }
}
