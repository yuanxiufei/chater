public class NestLoopDemo {

    public static void main(String[] args) {
        int carriage; // 车厢
        int seat; // 座位
        for (carriage =1; carriage <= 8; carriage++) {
            System.out.println("==车厢号：" + carriage + "==");
            for (seat = 1; seat <= 15; seat++) {
                System.out.println("座位号：" + seat);
            }
        }
    }
}
