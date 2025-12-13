public class Client {
    public static void main(String[] args) {
        PriceCalculator calculator = new PriceCalculator();
        double originalPrice = 120.0;

        // 使用满减策略
        calculator.setStrategy(new FullReductionStrategy());
        System.out.println("【满减策略】最终价格：" + calculator.calculatePrice(originalPrice));

        // 使用打折策略
        calculator.setStrategy(new PercentageDiscountStrategy());
        System.out.println("【打折策略】最终价格：" + calculator.calculatePrice(originalPrice));

        // 使用 VIP 策略
        calculator.setStrategy(new VipDiscountStrategy());
        System.out.println("【VIP策略】最终价格：" + calculator.calculatePrice(originalPrice));
    }
}