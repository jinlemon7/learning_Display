class CouponDiscountHandler implements DiscountHandler {
    private DiscountHandler nextHandler;

    @Override
    public void setNextHandler(DiscountHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void applyDiscount(Order order) {
        if (order.hasCoupon()) {
            System.out.println("优惠券折扣: -30");
            order.setAmount(order.getAmount() - 30);
        }
        if (nextHandler != null) {
            nextHandler.applyDiscount(order);
        }
    }
}