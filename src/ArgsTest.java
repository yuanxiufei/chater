public class ArgsTest {
    public static void guessAge(int age) {
        age--;
        System.out.println("guessAge中，age="+ age);
    }


    public  static  void guessAge(Args args){
        args.setAge(20);
        System.out.println("args：" +args.getAge());
    }

    public static void main(String[] args) {
        //int age = 18;
        //guessAge(age);
        //System.out.println("main方法中，age="+age);
        Args args1 = new Args(18);
        System.out.println("args1：" +args1.getAge());

        guessAge(args1);
        System.out.println("main方法，age="+ args1.getAge());

        ArgsArray argsArray = new ArgsArray();
        argsArray.polygonPerimeter("三角形",80,80,80);
        argsArray.polygonPerimeter("多边形",80,80,80,90,65);

    }
}
