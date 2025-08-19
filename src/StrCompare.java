public class StrCompare {

  public static void main(String[] args) {
    // car1 car2 存储在堆内存中，地址不同
    String car1 = new String("Golf");
    String car2 = new String("Golf");

    // car3 car4 存储在字符串常量池中
    // 先去常量池中查找是否存在相同的字符串，如果存在，不创建；如果不存在，则创建新字符串，存储在常量池中
    String car3 = "golf";
    String car4 = "Golf";

    System.out.println("car1 == car2: " + (car1 == car2));
    System.out.println("car3 == car4: " + (car3 == car4));

    if (car1.equals(car2)) {
      System.out.println("字符串car1和car2内容相同");
    }

    if (car3.equalsIgnoreCase(car4)) {
      System.out.println("忽略大小写，字符喜欢car3和car4内容相同");
    }
  }
}
