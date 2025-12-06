public class InAppMessageFactory implements MessageFactory {
    @Override
    public Message createMessage() {
        return new InAppMessage();
    }
}