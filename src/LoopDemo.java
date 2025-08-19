import java.util.Scanner;

public class LoopDemo {


    /*
     * while方法
     * */
    public static void whileDemo() {
        int remainCharge = 100;
        int count = 0;
        while (remainCharge >= 10) {
            count++;
            System.out.println("第" + count + "圈");
            remainCharge -= 10; // 每跑一圈，电量减少10度
            System.out.println("剩余电量：" + remainCharge + "度");
        }
        System.out.println("要没电了， 不够跑一圈了");
    }

    /*
     * do while方法
     * */
    public static void doWhileDemo() {
        int num = 100;
        int n1;
        int n2;
        int n3;
        do {
            // 判断num是否是水仙花数
            n1 = num % 10;
            n2 = num / 10 % 10;
            n3 = num / 100;
            if (n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == num) {
                System.out.println(num + "是水仙花数");
            }
            num++;
        } while (num <= 999);
    }

    /*
     * for 方法
     * */
    public static void forDemo() {
        for (int num = 1; num <= 100; num++) {
            if (num % 10 == 7 || num / 10 % 10 == 7 || num % 7 == 0) {
                System.out.println(num + "拍拍手");
            }
            num++;
            if (num > 100) {
                break;
            }
        }
    }

    /*
    * Scanner 输入控件
    * */
    public static void scannerDemo() {
        // 初始化一个对象
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入比赛得分：");
        int score = sc.nextInt(); // 输入int型数据
        System.out.println("分数是："+ score);

        System.out.println("科目二是多少分：");
        float score1 = sc.nextFloat(); // 输入int型数据
        System.out.println("分数是："+ score1);
    }

    /*
     * continue 退出循环
     * */
    public static void continueDemo() {
        // 初始化一个对象

        int num;
        int count = 3;
        Scanner sc  = new Scanner(System.in);
        while(count >=1) {
            System.out.println("请输入你的幸运数字:");
            num = sc.nextInt();
            count--;
            if (num !=5) {
                System.out.println("抱歉,没有中获奖,还有" + count + "机会哦~");
                continue;
            }
            System.out.println("恭喜你,请前去兑奖");
        }
    }


    public static void main(String[] args) {
        // whileDemo();
        // doWhileDemo();
        // forDemo();
        // scannerDemo()
        continueDemo();
    }
}
