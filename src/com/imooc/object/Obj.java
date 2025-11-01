package com.imooc.object;

import com.imooc.car.SealCar;

public class Obj extends Object{
    public static void main(String[] args) {
        SealCar sealCar = new SealCar();
        System.out.println(sealCar);
        SealCar sealCar2 = new SealCar();
        System.out.println(sealCar2);
        //Object=> equals 比较两个对象的引用地址是否相等
        System.out.println("SealCar === SealCar2："+ sealCar.equals(sealCar2));
        String name = "小慕";
        String nickName = "小慕";
        System.out.println(" name == nickName： " + name.equals(nickName));
    }
}
