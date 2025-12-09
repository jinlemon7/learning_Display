public class NormalMessage extends Message {
    public NormalMessage(MessageSender sender) {
        super(sender);
    }

    public void send(String content) {
        System.out.println("【普通通知】开始发送...");
        sender.send(content);
    }
}