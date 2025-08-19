public class IfDemo {
    public static void main(String[] args) {
        int temperature = 25;
        if (temperature >= 20) {
            System.out.println("今天天气好出去爬山");
        }

        float score = 66;
        if (score >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("还要努力啊");
        }
        // 三元运算
        System.out.println( score >60 ? "及格了" : "努力吧少年");
    }
}
