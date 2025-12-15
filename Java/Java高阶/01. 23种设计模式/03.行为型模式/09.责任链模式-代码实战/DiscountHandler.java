interface DiscountHandler {
    void setNextHandler(DiscountHandler handler);  // 设置下一个处理器
    void applyDiscount(Order order); // 应用优惠策略
}