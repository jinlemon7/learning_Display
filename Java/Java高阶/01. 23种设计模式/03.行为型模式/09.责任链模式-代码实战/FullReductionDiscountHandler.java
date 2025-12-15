class FullReductionDiscountHandler implements DiscountHandler {
    private DiscountHandler nextHandler;  // 下一个处理器

    @Override
    public void setNextHandler(DiscountHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void applyDiscount(Order order) {
        if (order.getAmount() > 200) {
            System.out.println("满减折扣: -50");
            order.setAmount(order.getAmount() - 50);
        }
        if (nextHandler != null) {
            nextHandler.applyDiscount(order);  // 继续传递给下一个处理器
        }
    }
}

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

class MemberDiscountHandler implements DiscountHandler {
    private DiscountHandler nextHandler;

    @Override
    public void setNextHandler(DiscountHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void applyDiscount(Order order) {
        if (order.isMember()) {
            System.out.println("会员折扣: -20");
            order.setAmount(order.getAmount() - 20);
        }
        if (nextHandler != null) {
            nextHandler.applyDiscount(order);
        }
    }
}