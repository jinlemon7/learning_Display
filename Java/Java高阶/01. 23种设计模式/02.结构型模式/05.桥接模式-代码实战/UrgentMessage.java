public class UrgentMessage extends Message {
    public UrgentMessage(MessageSender sender) {
        super(sender);
    }

    public void send(String content) {
        System.out.println("【紧急告警】开始发送...");
        sender.send("【加急】" + content);
    }
}