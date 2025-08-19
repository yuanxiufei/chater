public class PracticeDemo {

    public static void main(String[] args) {

        int speed = 50; // 速度50
        int hour = 1; // 时间
        double distance = speed * hour; // 行驶里程
        System.out.println(hour + "小时候行驶" + distance + "公里");

        speed += 10;
        hour++;
        distance += speed * 1; // 先做乘法在做加法赋值
        System.out.println(hour + "小时候行驶" + distance + "公里");
    }

}
