class Order {
    private OrderState state;

    public Order() {
        this.state = new PendingState(); // 初始状态为“待支付”
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest(this); // 调用当前状态的处理方法
    }
}