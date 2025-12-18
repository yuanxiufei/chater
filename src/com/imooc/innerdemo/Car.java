package com.imooc.innerdemo;

public class Car { // 外部类

  private String brand = "比亚迪";

  /**
   * 成员内部类 1.内部类可以直接访问内部类，包括私有成员
   */
  class Engine {

    public void show() {
      System.out.println("汽车品牌：" + brand);
    }
  }

}
