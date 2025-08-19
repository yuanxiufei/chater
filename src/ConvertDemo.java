public class ConvertDemo {
    public static void main(String[] args) {

        int  i_1 = 26;
        int i_2 = 260;

        byte b_1 = (byte) i_1;
        byte b_2 = (byte) i_2; // byte取值范围是-128~127
        System.out.println("强制转化的类型b_1：" + b_1);
        System.out.println("强制转化的类型b_2：" + b_2);

        int price_1 = 200;
        int price_2 = 2000;
        int price_3 = 1200;

        int sum  = price_1 + price_2 + price_3;
        System.out.println("一季度一共加油花了"+ sum + '元');
        float avg_1 = sum /3; // 浮点数除以整数依旧是整数
        System.out.println("每个月的平均值：" + avg_1);
        float avg = (float) sum /3; // 浮点数除以整数依旧是整数
        System.out.println("强制转化之后，每个月的平均值：" + avg);
    }
}
