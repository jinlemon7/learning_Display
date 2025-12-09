public interface User {
    void addFollower(Follower follower);
    void removeFollower(Follower follower);
    void notifyFollowers(String postContent);
}