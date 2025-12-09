public class SMSSender implements MessageSender {
    public void send(String message) {
        System.out.println("通过【短信】发送消息：" + message);
    }
}