class VirtualProductOrder extends OrderProcessTemplate {
    @Override
    protected void pay() {
        System.out.println("支付虚拟商品的订单");
    }

    @Override
    protected void deliver() {
        System.out.println("通过邮件发送虚拟商品");
    }
}