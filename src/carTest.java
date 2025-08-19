public class carTest {

  public static void main(String[] args) {

    // 使用成员方法
    System.out.println("------三参数构造方法--------");
    // 创建对象
    Car c1 = new Car(2000f, '红', 900);
    c1.charge();
    c1.drive();
    System.out.println("------双参数构造方法--------");
    // 创建对象
    Car c2 = new Car(1000f, 800);
    c2.charge();
    c2.drive();
    System.out.println("------无参数构造方法--------");
    // 创建对象
    Car c3 = new Car();
    c3.charge();
    c3.drive();
    System.out.println("------匿名对象--------");
    new Car(1000f, 700).drive();

    // 使用成员变量
    // c1.price = 19999f;
    // c1.mileage = 500;
    // System.out.println("成员变量price：" + c1.price);
    // System.out.println("成员变量color：" + c1.color);
    // System.out.println("成员变量mileage：" + c1.mileage);
  }
}
