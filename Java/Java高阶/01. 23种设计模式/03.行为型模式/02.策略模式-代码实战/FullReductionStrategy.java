public class FullReductionStrategy implements DiscountStrategy {
    @Override
    public double calculate(double originalPrice) {
        if (originalPrice >= 100) {
            return originalPrice - 20; // 满减
        }
        return originalPrice;
    }
}