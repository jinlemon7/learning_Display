public class Client {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SMSSender();
        MessageSender weChatSender = new WeChatSender();

        Message normalMsgViaEmail = new NormalMessage(emailSender);
        Message urgentMsgViaSMS = new UrgentMessage(smsSender);
        Message urgentMsgViaWeChat = new UrgentMessage(weChatSender);

        normalMsgViaEmail.send("欢迎使用我们的系统！");
        urgentMsgViaSMS.send("服务器 CPU 负载率过高！");
        urgentMsgViaWeChat.send("数据库连接异常！");
    }
}