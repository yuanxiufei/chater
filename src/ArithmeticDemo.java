public class ArithmeticDemo {
    public static void main(String[] args) {

        int num_1 = 100;
        int num_2 = 9;
        int remainder  = num_1%num_2; // 求余
        System.out.println("num_1除以num_2, 余数是："+ remainder);

        // 定义不同类型变量进行逻辑运算
        int i = 100; // 声明int变量
        float f = 13.14f; // 声明float变量
        double d = 125.125; // 声明double变量

        System.out.println("int型与float型运算" + (i+f));
        System.out.println("double型与float型运算" + (f*d));
        System.out.println("int型与double型运算" + (i/d));
    }
}
