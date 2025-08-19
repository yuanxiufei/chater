public class MethodDemo {
    /*
    * 定义方法
    * 判断成绩
    * */

    public static  void scoreAssess (float score, String name) {
        if (score >= 60) {
            System.out.println(name+"及格了");
        } else {
            System.out.println(name+"还要努力啊");
        }
    }

    /**
     * 定义方法
     * 在哪里学习
     * */
    public static void weekPlan (int day) {
        if (day >= 1 && day <= 5) {
            System.out.println("去学校上学");
        }else {
            if (day == 6) {
                System.out.println("在家学习");
            }else {
                System.out.println("逛街看电影");
            }
        }
    }

    /**
     * 定义方法
     * 在哪里学习
     * */
    public static void   ranking (int score) {
        if (score < 60 && score >=0 ) {
            System.out.println("不及格");
        }else if (score >= 60 && score < 70) {
            System.out.println("及格");
        }else if (score >= 70 && score < 80) {
            System.out.println("中等");
        } else if (score>= 80&& score < 90) {
            System.out.println("良好");
        } else if (score>= 90 && score < 100) {
            System.out.println("优秀");
        } else if (score == 100) {
            System.out.println("学霸");
        }
    }



    public static void main(String[] args) {
        float xiaomuSocre = 66;
        float damaoSocre = 70;

        scoreAssess(xiaomuSocre, "小慕");
        scoreAssess(damaoSocre, "大毛");
        weekPlan(6);
        ranking(90);
    }
}
