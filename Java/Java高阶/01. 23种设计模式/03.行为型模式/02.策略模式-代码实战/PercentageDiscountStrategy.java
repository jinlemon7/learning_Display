public class PercentageDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculate(double originalPrice) {
        return originalPrice * 0.9; // 打九折
    }
}