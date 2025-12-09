public class EmailSender implements MessageSender {
    public void send(String message) {
        System.out.println("通过【邮件】发送消息：" + message);
    }
}