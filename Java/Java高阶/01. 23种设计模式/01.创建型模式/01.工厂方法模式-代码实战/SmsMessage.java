public class SmsMessage implements Message {
    @Override
    public void send(String to, String content) {
        System.out.println("发送短信给 " + to + "，内容：" + content);
    }
}