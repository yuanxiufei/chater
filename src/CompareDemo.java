public class CompareDemo {

    public static void main(String[] args) {


        double price_92 = 7.43;
        double price_95 = 8.25;
        // 等值比较
        System.out.printf("price_95 等于 price_92 吗？%b%n", (price_95 == price_92));

        // 不等比较
        System.out.printf("price_95 不等于 price_92 吗？%b%n", (price_95 != price_92));

        // 大小比较
        System.out.printf("price_95 大于 price_92 吗？%b%n", (price_95 > price_92));
        System.out.printf("price_95 小于 price_92 吗？%b%n", (price_95 < price_92));

        // 包含等值的大小比较
        System.out.printf("price_95 大于或等于 price_92 吗？%b%n", (price_95 >= price_92));
        System.out.printf("price_95 小于或等于 price_92 吗？%b%n", (price_95 <= price_92));
    }


}
