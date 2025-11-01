package com.imooc.pack1;

public class Car {
    private String category; // 交通工具种类
    private double speed; // 最高时速

    // 全参数的构造参数
    public Car(String category, double speed) {
        this.category = category;
        this.speed = speed;
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
                if (speed>0){
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

    protected void showInfo() {
        System.out.println("描述：" + category);
        System.out.println("最高时速：" + speed);
    }
}
