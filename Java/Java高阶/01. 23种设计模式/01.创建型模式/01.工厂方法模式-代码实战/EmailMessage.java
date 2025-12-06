public class EmailMessage implements Message {
    @Override
    public void send(String to, String content) {
        System.out.println("发送邮件给 " + to + "，内容：" + content);
    }
}