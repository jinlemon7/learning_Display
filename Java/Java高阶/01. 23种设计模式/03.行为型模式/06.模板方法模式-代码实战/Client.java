public class Client {
    public static void main(String[] args) {
        System.out.println("处理实物商品订单：");
        OrderProcessTemplate physicalOrder = new PhysicalProductOrder();
        physicalOrder.processOrder(); // 调用模板方法

        System.out.println("\n处理虚拟商品订单：");
        OrderProcessTemplate virtualOrder = new VirtualProductOrder();
        virtualOrder.processOrder(); // 调用模板方法
    }
}