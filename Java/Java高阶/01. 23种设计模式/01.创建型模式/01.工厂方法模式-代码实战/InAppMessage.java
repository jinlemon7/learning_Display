public class InAppMessage implements Message {
    @Override
    public void send(String to, String content) {
        System.out.println("发送站内信给 " + to + "，内容：" + content);
    }
}