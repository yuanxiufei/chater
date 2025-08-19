public class LogicOperator {
    public static void main(String[] args) {
        int time = 5;
        // 逻辑或运算
        boolean res = (time<7) || (time>20);
        System.out.println("逻辑或运算结果："+ res);

        // 逻辑非运算
        System.out.println("逻辑非运算结果："+ !res);

        // 逻辑与计算
        int age = 18;
        boolean res_2 = (age>=18)&&(age<=70);
        System.out.println("逻辑与运算结果："+ res_2);
    }
}
