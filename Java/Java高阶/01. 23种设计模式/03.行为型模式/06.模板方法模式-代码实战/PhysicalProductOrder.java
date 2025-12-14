class PhysicalProductOrder extends OrderProcessTemplate {
    @Override
    protected void pay() {
        System.out.println("支付实物商品的订单");
    }

    @Override
    protected void deliver() {
        System.out.println("发货实物商品");
    }
}