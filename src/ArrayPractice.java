public class ArrayPractice {

    /*
     * 求数组的最大值和最小值
     */
    public static void arrayCompare() {
        int[] carriage = {156, 300, 500, 800, 900, 700, 600, 400, 300, 200, 100};
        int max = carriage[0]; // 最大值
        int min = carriage[0];
        for (int c : carriage) {
            if (c > max) {
                max = c;
            }
            if (c < min) {
                min = c;
            }
        }
        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
    }

    /*
     * 冒泡排序
     **/
    public static void bubleSort() {
        int[] carriage = {125, 96, 180, 88, 55};
        int length = carriage.length;
        int temp = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (carriage[j] > carriage[j + 1]) {
                    temp = carriage[j];
                    carriage[j] = carriage[j + 1];
                    carriage[j + 1] = temp;
                }
            }
            // 输出本轮冒泡排序之后的数组
            System.out.println("第" + (i + 1) + "轮冒泡排序：");
            for (int k : carriage) {
                System.out.println(k + "\t");
            }
        }
    }

    /*
     * 二维数组
     * */
    public static void scoreArray() {
        float[][] score1 = {{100f, 90f, 98.5f}, {10f, 70f, 98.5f}, {100f, 60f, 68.5f}, {160f, 50f, 93.5f}};

        float sumScore = 0.0f; // 个人总成绩
        float avgScore = 0.0f;  // 个人平均分

        float sum_chinese = 0.0f; //语文总成绩
        float sum_math = 0.0f; //数学总成绩
        float sum_english = 0.0f;//英语总成绩
        for (int row = 0; row < score1.length; row++) {
            for (int col = 0; col < score1[row].length; col++) {
                sumScore += score1[row][col];
                avgScore = sumScore / score1[row].length;
            }
            sum_chinese+= score1[row][0];
            sum_math+= score1[row][1];
            sum_english+= score1[row][2];

            System.out.println("第" + (row + 1) + "名同学的平均分：" + avgScore);
            System.out.println("语文总成绩：" + sum_chinese);
            System.out.println("数学总成绩：" + sum_math);
            System.out.println("英语总成绩：" + sum_english);
        }
    }

    public static void main(String[] args) {
        // arrayCompare();
        // bubleSort();
        scoreArray();
    }
}
