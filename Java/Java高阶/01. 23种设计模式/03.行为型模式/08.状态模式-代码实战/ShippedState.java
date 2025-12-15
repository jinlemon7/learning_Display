class ShippedState implements OrderState {
    @Override
    public void handleRequest(Order order) {
        System.out.println("订单已发货，请等待接收。");
        order.setState(new CompletedState()); // 完成后，改变订单状态为已完成
    }
}