import java.sql.SQLOutput;

public class ModDemo {
    public static void main(String[] args) {
        int a = 5;
        int res_1 =  a++ + 15;
        System.out.println("a++ + 15 = " + res_1);
        int res_2 = ++a + 15;
        System.out.println("++a + 15 = " + res_2);
    }
}
