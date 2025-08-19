import java.util.Scanner;

public class Exam {

    /*
     *5次抽题机会，一次抽取“笔试+机试”两份试题
     *先作答笔试题，后作答机试题
     *笔试及格后，才能进行机试，如笔试不及格，重新抽题，5次机会用完，考试结束
     *笔试及格，机试不及格，重新抽题，5次机会用完，考试结束
     *5次机会没用完，两项均及格，提前结束考试，不再抽题
     */
    public static void exam() {
        int count = 0; // 出题次数
        int souce_1 = 0; // 笔试成绩
        int souce_2 = 0;  // 机试成绩
        Scanner sc = new Scanner(System.in);
        while (count < 5) {
            count++;
            System.out.println("=====第" + count + "次考试=====");

            /*----笔试----*/
            System.out.println("请输入笔试的成绩:" + count);
            souce_1 = sc.nextInt();
            if (souce_1 < 60) {
                if (count < 5) {
                    System.out.println("笔试不及格,请重新抽题");
                } else {
                    System.out.println("5次机会用完了");
                    System.out.println("最后一次的成绩是" + souce_1);
                }
                continue;
            }
            /*----机试----*/
            System.out.println("请输入机试的成绩:" + count);
            souce_2 = sc.nextInt();
            if (souce_2 < 60) {
                if (count < 5) {
                    System.out.println("机试不及格,请重新抽题");
                } else {
                    System.out.println("5次机会用完了");
                    System.out.println("最后一次的成绩是" + (souce_1 + souce_2));
                }
                continue;
            }
            System.out.println("笔试和机试都及格了,总成绩是:" + (souce_1 + souce_2));
            break;
        }
    }

    public static void main(String[] args) {
        exam();
    }

}
