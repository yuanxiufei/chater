package com.imooc.gasiline;

public class Tang2025 extends Tang {
    final String MODEL = "唐";  //显示初始化
    final int YEAR;


//    {
//     // 构造代码块，初始化final修饰的成员变量
//     this.YEAR = 2025;
//    }

    public Tang2025(int year) {
        // 构造方法中，初始化成员变量
        this.YEAR = year;
    }

    public void show2023() {
        System.out.println("比亚迪唐油车已被停产，2025年是有油电混动");
    }
}
