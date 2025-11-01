package com.imooc.polymorhism;
public class SealCarTest {
    public static void main(String[] args) {

        // 向上转型
        OceanCar seal = new SealCar();
        OceanCar seagull = new SeagullCar();
        OceanCar car = new OceanCar("汽车");

        // 多态方式编译成员方法时，先检查父类中是否有该方法时，如果没有，则编译报错，如果有，则调用子类重写的方法
        // 编译看左，运行看右
        seal.drive();
        seagull.drive();
        car.drive();

        // 向下转型
        // 只有向上转型过的对象，才行向下转型
        SealCar sealCar = (SealCar)seal;
        sealCar.speedUp();

        // 父类实例对象不能强制转换为子类类型
        //SealCar sealCar1 = (SealCar)car;

        // 判断seagull是否属于SealCar或者SealCar的子类
        // 先判断类型校验，再转型
        if (seagull instanceof SealCar) {
            // 没有继承关系，不能进行类型转换
            SealCar sealCar3 = (SealCar)seagull;
        }

        System.out.println("car instanceof SealCar："+(car instanceof SealCar));
        System.out.println("car instanceof SealCar："+(car instanceof OceanCar));

        // 多态方式访问成员变量，运行的时候，调用父类的成员变量
        // 编译看左，运行也看左
        System.out.println(seal.speed);
        System.out.println(seagull.speed);
    }
}

