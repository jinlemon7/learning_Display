public class ChatClient {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User yupi = new ChatUser("鱼皮", chatRoom);
        User yes = new ChatUser("Yes哥", chatRoom);
        User y = new ChatUser("小y", chatRoom);

        chatRoom.registerUser(yupi);
        chatRoom.registerUser(yes);
        chatRoom.registerUser(y);

        yupi.send("大家好！");
        yes.send("Hi 鱼皮！");
    }
}