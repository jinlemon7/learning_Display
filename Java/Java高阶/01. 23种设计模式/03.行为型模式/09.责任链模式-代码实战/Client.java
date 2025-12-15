public class Client {
    public static void main(String[] args) {
        Order order = new Order(250, true, true);  // 创建订单

        // 创建各个优惠处理器
        DiscountHandler fullReductionHandler = new FullReductionDiscountHandler();
        DiscountHandler couponHandler = new CouponDiscountHandler();
        DiscountHandler memberHandler = new MemberDiscountHandler();

        // 设置责任链：优惠处理器依次连接
        fullReductionHandler.setNextHandler(couponHandler);
        couponHandler.setNextHandler(memberHandler);

        // 开始应用优惠
        fullReductionHandler.applyDiscount(order);  // 从满减开始处理
        System.out.println("最终订单金额: " + order.getAmount());
    }
}