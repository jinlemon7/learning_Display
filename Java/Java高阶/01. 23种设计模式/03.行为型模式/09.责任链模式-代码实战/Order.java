class Order {
    private double amount;  // 订单金额
    private boolean hasCoupon;  // 是否使用了优惠券
    private boolean isMember;  // 是否为会员

    public Order(double amount, boolean hasCoupon, boolean isMember) {
        this.amount = amount;
        this.hasCoupon = hasCoupon;
        this.isMember = isMember;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean hasCoupon() {
        return hasCoupon;
    }

    public boolean isMember() {
        return isMember;
    }
}