interface OrderState {
    void handleRequest(Order order); // 处理订单请求，根据不同状态执行不同操作
}