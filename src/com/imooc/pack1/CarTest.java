package com.imooc.pack1;

public class CarTest {
    public static void main(String[] args) {
        Car car  = new Car("car", 180);
        car.setCategory("car");
        car.setSpeed(180);
        car.showInfo();

        Car airplane = new Car("airplane", 3800);
        airplane.setCategory("airplane");
        airplane.setSpeed(9000);
        airplane.showInfo();
    }
}
