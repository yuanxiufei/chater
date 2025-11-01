public class ArgsArray {
    /**
     *计算多边形的周长
     */
    public void polygonPerimeter(String shdape,double ...sides){
        double perimeter = 0; // 周长
        for (int i=0;i<sides.length;i++){
            perimeter += sides[i];
        }

        System.out.println(shdape+"周长是：" + perimeter);
    }
}
