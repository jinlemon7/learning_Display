public class PriceCalculator {
    private DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculatePrice(double originalPrice) {
        if (strategy == null) {
            throw new IllegalStateException("未设置折扣策略");
        }
        return strategy.calculate(originalPrice);
    }
}