public class SwitchDemo {

    /**
     *去哪里旅游
     * */
    public static void travel (String val){
       switch(val){
           case "黑龙江" :
               System.out.println("看白山黑水，走林海雪原");
               break;
           case "海南":
               System.out.println("天涯海角，南国风情");
               break;
           case "云南":
               System.out.println("彩云之南，四季如春");
               break;
           case "陕西":
               System.out.println("人文陕西，多彩三秦");
               break;
               default:
               System.out.println("本地一日游");
               break;

       }
    }

    public static void main(String[] args) {
        travel("陕西");
        travel("云南");
    }
}
