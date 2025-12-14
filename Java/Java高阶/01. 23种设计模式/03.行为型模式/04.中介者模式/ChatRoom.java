import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatRoomMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receive(sender.name + "：" + message);
            }
        }
    }

    @Override
    public void registerUser(User user) {
        users.add(user);
    }
}