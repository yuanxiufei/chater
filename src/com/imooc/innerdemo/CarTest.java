package com.imooc.innerdemo;

import com.imooc.interfacedemo.Vehicle;

public class CarTest {
    public static void main(String[] args) {
        // 创建外部类
        Car car = new Car();
         car.drive();

        // 成员内部类对象
        Car.Engine engine = new Car().new Engine();
        // engine.show();

        // 访问静态内部类中的静态方法
        Car.ControlSystem.show();


        // 外部类的外部实例化静态内部类
        Car.ControlSystem controlSystem = new Car.ControlSystem();
        controlSystem.lingthControl();

        /*
         * 匿名内部类
         * 包包含：继承或实现关系、方法重写、创建对象
         * 等号右侧：匿名内部类，定义并创建接口的子类对象
         * 等号左侧：多态赋值，接口类型应用指向子类对象
         */
       Vehicle vehicle = new Vehicle(){
            @Override
            public void speedUp() {
                System.out.println("加速行驶");
            }

            @Override
            public void speedDown() {
                System.out.println("减速行驶");
            }
       };

       System.out.println("-----------匿名内部类--------------");
       vehicle.speedUp();
       vehicle.speedDown();
       System.out.println("-----------内部类重载---------------");
       car.drive(new Vehicle(){
           @Override
           public void speedUp() {
               System.out.println("重载加速行驶");
           }

           @Override
           public void speedDown() {
               System.out.println("重载减速行驶");
           }
       });
    }
}
