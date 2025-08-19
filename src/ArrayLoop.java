public class ArrayLoop {


    /*
    * for 循环方法
    * */
    public static void ArrayLoop() {
        int [] carriage = new int[]{125,260,300,400,500};
        int sum = 0; // 总人数
        // 遍历数组
        for (int i = 0; i < carriage.length; i++) {
            System.out.println("carriage第"+ i +"节车厢的人数:" + carriage[i]);
            sum += carriage[i];
        }
        System.out.println("总人数：" + sum);
    }

    /**
     * foreach 循环方法
     * **/
    public static void forEach() {
        int[] carriage = new int[]{125, 260, 300, 400, 500};
        int sum = 0;

        // 使用 foreach 遍历数组
        for (int num : carriage) {
            System.out.println("每节车厢人数：" + num);
            sum += num;
        }

        System.out.println("总人数: " + sum);
    }


    public static void main(String[] args) {
        // ArrayLoop();
        forEach();
    }

}
