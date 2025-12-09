import java.util.ArrayList;
import java.util.List;

public class ConcreteUser implements User {
    private String userName;
    private List<Follower> followers;

    public ConcreteUser(String userName) {
        this.userName = userName;
        this.followers = new ArrayList<>();
    }

    @Override
    public void addFollower(Follower follower) {
        followers.add(follower);
    }

    @Override
    public void removeFollower(Follower follower) {
        followers.remove(follower);
    }

    @Override
    public void notifyFollowers(String postContent) {
        for (Follower f : followers) {
            f.update(userName, postContent);
        }
    }

    public void post(String content) {
        System.out.println(userName + " 发布动态：" + content);
        notifyFollowers(content);
    }
}