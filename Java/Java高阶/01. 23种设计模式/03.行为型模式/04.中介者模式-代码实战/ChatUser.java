public class ChatUser extends User {

    public ChatUser(String name, ChatRoomMediator mediator) {
        super(name, mediator);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " 发送消息：" + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " 收到消息：" + message);
    }
}