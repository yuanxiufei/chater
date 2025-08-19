public class Exericise {
    public static void main(String[] args) {
        int speed = 50; // 速度
        int hour = 1;
        int n = 5;
        double distance = 0; // 距离
        for (hour = 1; hour <= n; hour++) {
            distance += speed*1;
            speed+=10;
            System.out.println(hour+"小时后行驶"+ distance + "千米");
        }

        while (hour<=n) {
            distance += speed*1;
            speed+=10;
            System.out.println(hour+ "小时后行驶" + distance +"千米");
            hour++;
        }

        do {
            distance += speed*1;
            speed+=10;
            System.out.println(hour+ "小时后行驶" + distance +"千米");
            hour++;
        }while (hour<=n);
    }
}
