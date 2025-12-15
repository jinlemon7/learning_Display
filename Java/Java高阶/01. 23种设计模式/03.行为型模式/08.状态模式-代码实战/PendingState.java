class PendingState implements OrderState {
    @Override
    public void handleRequest(Order order) {
        System.out.println("订单处于待支付状态，请支付。");
        order.setState(new PaidState()); // 支付完成后，改变订单状态为已支付
    }
}