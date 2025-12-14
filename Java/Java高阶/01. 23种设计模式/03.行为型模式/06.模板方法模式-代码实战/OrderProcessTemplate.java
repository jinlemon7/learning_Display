abstract class OrderProcessTemplate {
    // 模板方法，定义了订单处理的固定步骤
    public final void processOrder() {
        checkStock();
        pay();
        deliver();
        notifyCustomer();
    }

    // 校验库存的步骤，所有订单都需要
    protected void checkStock() {
        System.out.println("检查库存");
    }

    // 支付步骤，交由具体子类实现
    protected abstract void pay();

    // 发货步骤，交由具体子类实现
    protected abstract void deliver();

    // 通知客户的步骤，所有订单都需要
    protected void notifyCustomer() {
        System.out.println("通知客户订单处理完成");
    }
}