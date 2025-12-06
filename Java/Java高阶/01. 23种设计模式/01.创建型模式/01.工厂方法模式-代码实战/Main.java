public class Main {
    public static void main(String[] args) {
        MessageFactory factory = new SmsMessageFactory(); // 切换只需换这里
        NotificationService service = new NotificationService(factory);
        service.notifyUser("13812345678", "您的验证码是 123456");
    }
}