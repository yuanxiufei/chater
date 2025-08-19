public class ArrayDemo {
    public static void main(String[] args) {
        // 声明数组
        float [] score;
        //  创建数组
        score = new float[6];

        // 初始化数组
        score[0] = 98.5f;
        score[1] = 99.5f;
        score[2] = 99.5f;
        score[3] = 99.5f;
        score[4] = 98.5f;
        score[5] = 99.5f;


        // 访问数组元素
        for (int i = 0; i < score.length; i++) {
            System.out.println("数组第"+ i +"元素:" + score[i]);
        }

        int [] carriage = new int[]{125,260,300,400,500};
        int [] carriage2 = carriage;
        carriage2[2] = 950;
        carriage2[3] = 1000;
        for (int i = 0; i < carriage.length; i++) {
            System.out.println("carriage第"+ i +"节车厢的人数:" + carriage[i]);
        }
        for (int i = 0; i < carriage2.length; i++) {
            System.out.println("carriage2第"+ i +"节车厢的人数:" + carriage2[i]);
        }
    }
}
