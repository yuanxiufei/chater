package com.imooc.abstracts;

/**
 * 1.子类继承抽象类，必须重写父类的抽象方法
 * 2.否则子类也必须是抽象类，由子类的子类重写抽象方法
 */
public abstract class Bicyle extends Vehicle {
    @Override
    public void drive() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void speedUp() {
        super.speedUp();
    }
}
