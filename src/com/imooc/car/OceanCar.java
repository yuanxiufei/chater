package com.imooc.car;

public class OceanCar {
    private String model; //类型
    private String level; // 级别
    private String size; // 长宽高
    private double price; // 价格
    public int power; // 最大马力

    // 无参构造方法
//    public OceanCar() {
//        System.out.println("父类无参构造方法");
//    }

    // 有参构造方法
    public OceanCar(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void drive (){
        System.out.println(this.model+ "正在马路上狂奔...");
    }

    public void show(){
        System.out.println("父类：power=" + this.power);
    }
}
