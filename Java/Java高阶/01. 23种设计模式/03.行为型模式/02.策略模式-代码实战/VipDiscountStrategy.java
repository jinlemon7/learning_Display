public class VipDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculate(double originalPrice) {
        return originalPrice * 0.8; // VIP 打八折
    }
}