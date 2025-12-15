class CompletedState implements OrderState {
    @Override
    public void handleRequest(Order order) {
        System.out.println("订单已完成。");
    }
}