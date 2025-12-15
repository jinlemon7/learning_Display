class PaidState implements OrderState {
    @Override
    public void handleRequest(Order order) {
        System.out.println("订单已支付，请发货。");
        order.setState(new ShippedState()); // 发货后，改变订单状态为已发货
    }
}