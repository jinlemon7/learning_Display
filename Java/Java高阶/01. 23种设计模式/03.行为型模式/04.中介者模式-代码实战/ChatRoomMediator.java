public interface ChatRoomMediator {
    void sendMessage(String message, User sender);
    void registerUser(User user);
}