public class Client {
    public static void main(String[] args) {
        ConcreteUser star = new ConcreteUser("鱼皮");

        Follower f1 = new ConcreteFollower("张三");
        Follower f2 = new ConcreteFollower("李四");
        Follower f3 = new ConcreteFollower("王五");

        star.addFollower(f1);
        star.addFollower(f2);
        star.addFollower(f3);

        star.post("今天阳光真好，适合写代码！");
    }
}