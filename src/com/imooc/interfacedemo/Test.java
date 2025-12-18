package com.imooc.interfacedemo;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.speedUp();
        car.speedDown();
        car.drive();
        Vehicle.showSpeed();
        car.charge();
        car.brake();
        System.out.println("-------------------");
        MountainBike mountainBike = new MountainBike();
        mountainBike.drive();
    }
}
