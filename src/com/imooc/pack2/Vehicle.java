package com.imooc.pack2;

class Vehicle {
    private String category; // 交通工具种类
    private double speed; // 最高时速
    private static int count = 0;  // 统计实例化次数


    // 全参数的构造参数
    public Vehicle(String category, double speed) {
        this.category = category;
        this.speed = speed;
        count++;
    }

    public static void setCount(int count) {
        Vehicle.count = count;
        // 静态方法中，不能使用this关键字
        // this.category = "car";

        // 静态方法中，只能访问静态成员
        // speed = 200;

        // static 不能修饰局部变量
        // static int a =100;
    }

    public static int getCount() {
        return count;
    }


    // 设置描述
    public void setCategory(String category) {
        if (category != null && !category.isEmpty() && category.length() <= 50) {
            this.category = category;
        } else {
            System.out.println("类别描述错误，请输入1-50个字符，默认为car");
            this.category = "car"; // 默认交通工具类别为car
        }
    }

    // 设置速度
    public void setSpeed(double speed) {
        switch (this.category) {
            case "car":
                if (speed > 0 && speed <= 180) {
                    this.speed = speed;
                } else {
                    this.speed = 180;
                    System.out.println("s速度不合常理，汽车将最高时速设置为默认值180");
                }
                break;
            case "airplane":
                if (speed > 0 && speed <= 4000) {
                    this.speed = speed;
                } else {
                    this.speed = 4000;
                }
                break;
            case "foot":
                if (speed > 0 && speed <= 3000) {
                    this.speed = speed;
                } else {
                    this.speed = 3000;
                }
                break;
            default:
                if (speed > 0) {
                    this.speed = speed;
                }
                break;
        }

    }


    // 获取描述
    public String getCategory() {
        return category;
    }

    //获取速度
    public double getSpeed() {
        return speed;
    }

    void showInfo() {
        System.out.println("描述：" + category);
        System.out.println("最高时速：" + speed);
    }
}
