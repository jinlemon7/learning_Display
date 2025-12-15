public class Client {
    public static void main(String[] args) {
        Order order = new Order();  // 创建一个订单

        // 客户端操作：订单请求
        order.request();  // 初始状态是“待支付”

        // 模拟状态流转
        order.request();  // 订单支付后，进入“已支付”状态
        order.request();  // 订单发货后，进入“已发货”状态
        order.request();  // 订单完成后，进入“已完成”状态
    }
}