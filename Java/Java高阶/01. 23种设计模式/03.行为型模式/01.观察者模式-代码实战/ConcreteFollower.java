public class ConcreteFollower implements Follower {
    private String name;

    public ConcreteFollower(String name) {
        this.name = name;
    }

    @Override
    public void update(String userName, String postContent) {
        System.out.println(name + " 收到通知：@" + userName + " 发了一条新动态：" + postContent);
    }
}