public class EmailTask implements Task {
    @Override
    public void execute() {
        System.out.println("发送通知邮件...");
        // 实际的发邮件逻辑
    }
}