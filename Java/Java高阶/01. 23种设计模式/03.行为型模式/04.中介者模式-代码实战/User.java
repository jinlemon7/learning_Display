public abstract class User {
    protected String name;
    protected ChatRoomMediator mediator;

    public User(String name, ChatRoomMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void receive(String message);
    public abstract void send(String message);
}