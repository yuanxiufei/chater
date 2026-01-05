package com.imooc.innerdemo;

import com.imooc.interfacedemo.Vehicle;

public class Car { // 外部类

    private String brand = "比亚迪";
    public static String serialNumber = "007";
    /**
     * 成员内部类
     * 1.内部类可以直接访问外部类，包括私有成员
     * 2.外部类访问内部类成员，必须创建内部类对象
     * 3.外部类的内部，必须创建内部类：内部类  对象变量 = new 内部类()
     * 4.在外部类的外部，实例化内部类: 外部类.内部类 对象名 = new 外部类().new 内部类()
     * 5.内部类:public、protected、默认、private
     * 6.外部类:public、默认
     * 7.private修饰的内部类，只能在外部类的内部实例化对象
     * 8.内部类中，不允许定义静态成员
     * 9.内部类中，访问外部类对象： 外部类名.this.外部类名
     */
    class Engine {
        private String model = "B-Y-D";
        // public static String  serialNumber = '007'
        private String brand = "内部类-比亚迪";
        public void show() {
            System.out.println("汽车品牌：内部类定义成员变量" + brand);
            System.out.println("汽车品牌：外部部类定义成员变量"+ Car.this.brand);
        }
    }

    /**
     * 静态内部类
     * 1. 静态内部类，不能直接访问外部类的非静态变量成员
     * 2. 静态内部类，可以直接访问外部类的的静态成员
     * 3. 外部类的内部，访问静态内部类的静态成员： 静态类名：静态成员
     * 4. 在外部类的外部，访问静态内部类中的静态成员：外部类名.静态类名.静态成员()
     * 5. 在外部类的内部，实例化静态内部类：内部类 对象 = new  内部类()
     * 6. 在内部的外部，实例化静态内部类：外部类.内部类 对象名 = new 外部类.内部类()
     * 7. 访问内部类的非静态成员，实例化静态内部类，通过静态内部类对象访问
     */
    public static class  ControlSystem {
        public void lingthControl() {
            // System.out.println(brand);
            System.out.println("lingthControl静态内部类直接访问外部类的静态成员serialNumber："+ serialNumber);
        }
        public static  void show(){
            System.out.println("静态内部类-静态方法");
        }
    }

    public void drive() {
        // 成员内部对对象
        Engine engine = new Engine();
        System.out.println("engine.model:" + engine.model);
        engine.show();

        System.out.println("---------------------------------------");


        // 访问静态内部类的方法
        ControlSystem.show();

        // 静态内部类对象
        ControlSystem cs = new ControlSystem();
        cs.lingthControl();
    }

    // 重载
    public void drive(Vehicle vehicle) {
        vehicle.speedUp();
        vehicle.speedDown();
    }
}
