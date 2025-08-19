public class AssignDemo {
    public static void main(String[] args) {
        int a = 5;
        a+=50;
        System.out.println("a+=5, 结果："+ a);

        byte b =20;
        b+= 30; // 将b+30强制转换成byte类型
        System.out.println("b的值是："+ b);
    }
}
