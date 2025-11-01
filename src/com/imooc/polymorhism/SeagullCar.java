package com.imooc.polymorhism;

public class SeagullCar extends OceanCar {
    private int power = 75; // 最大马力
    int speed = 130; //最高时速

//    public SealCar() {
//        System.out.println("子类的无参构造方法");
//    }

    // 有参构造方法，super父类的构造参数
    public SeagullCar() {
        super("海鸥");
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }


    // 方法重写
    public void show() {
        super.show(); // 调用父类的方法
        System.out.println("子类：power=" + power);
        // 访问父类的成员变量
        // System.out.println("父类：power="+ super.power);
    }

    // 方法重载
    public void show(int a) {
        System.out.println("方法重载， a=" + a);
    }

    public void dirve() {
        System.out.println("双驱电机四驱的海鸥，正在马路上狂奔，最高时速：" + this.speed + "千米/小时");
    }

     // 重写toString方法
    @Override
    public String toString() {
        return "SealCar{" + "power=" + power + "};";
    }
}
