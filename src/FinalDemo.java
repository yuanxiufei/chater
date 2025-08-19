public class FinalDemo {
    public static void main(String[] args) {
        // 声明常量 常量只能赋值一次
        final int TANK_VOLUME = 100; // 一百升油

        float price = 9.5F; // 油价
        float totalPrice; // 总花销
        totalPrice = price * TANK_VOLUME;
        System.out.println("油价是5.5元，加了100升汽油，总花销是：" + totalPrice);

        // 油价变化过后
        price = 10.5F;
        totalPrice = price * TANK_VOLUME;
        System.out.println("油价是10.5元，加了100升汽油，总花销是：" + totalPrice);
    }
}
