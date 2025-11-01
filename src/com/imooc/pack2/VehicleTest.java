package com.imooc.pack2;

public class VehicleTest {
    public static void main(String[] args) {
        System.out.println("count：" + Vehicle.getCount() );

        Vehicle car  = new Vehicle("car", 180);
        car.setCategory("car");
        car.setSpeed(180);
        car.showInfo();

        Vehicle airplane = new Vehicle("airplane", 3800);
        airplane.setCategory("airplane");
        airplane.setSpeed(9000);
        airplane.showInfo();

        System.out.println("count：" + Vehicle.getCount() );
    }
}
