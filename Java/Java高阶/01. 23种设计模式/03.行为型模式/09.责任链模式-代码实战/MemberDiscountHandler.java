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