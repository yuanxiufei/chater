public class StrDemo {

  public static void main(String[] args) {

    // 方式一
    String brand = new String("Volkswagen");
    System.out.println("brand: " + brand);

    String voidStr = new String();
    System.out.println("voidStr: " + voidStr);

    // 方式二
    String car = "Golf";
    System.out.println("car: " + car);

    // 方式三
    char[] chs = {'M', 'a', 'g', 'o', 't', 'a', 'n'};
    String carMagotan = new String(chs);
    System.out.println("carMaggot: " + carMagotan);

    // 方式四
    String carPart = new String(chs, 5, 2);
    System.out.println("carPart: " + carPart);

    // 方式五
    String catTouran = "Tour" + carPart;
    System.out.println("catTouran: " + catTouran);
  }
}
