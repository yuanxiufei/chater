public class Car {

  // 成员变量
  float price; // 价格
  char color; // 颜色
  int mileage; // 续航里程


  // 三参数构造方法
  public Car(float price, char color, int mileage) {
    this.price = price;
    this.color = color;
    this.mileage = mileage;
    System.out.println("三构造参数: " + this);
  }

  //  双参数构造方法
  public Car(float price, int mileage) {
    this.price = price;
    this.mileage = mileage;
    System.out.println("双构造参数: " + this);
  }

  // 无参构造方法
  public Car() {
    System.out.println("无构造参数: " + this);
  }


  // 成员方法
  // 充电的方法
  public void charge() {
    System.out.println("汽车正在充电....");
  }


  // 行驶的方法
  public void drive() {
    System.out.println("汽车正在马路上狂奔....");
    System.out.println("汽车的价格：" + this.price);
    System.out.println("汽车续航里程：" + this.mileage);
  }
  
}
