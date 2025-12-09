public class WeChatSender implements MessageSender {
    public void send(String message) {
        System.out.println("通过【微信】发送消息：" + message);
    }
}