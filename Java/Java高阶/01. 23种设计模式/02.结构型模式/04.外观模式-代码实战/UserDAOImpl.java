import java.util.HashMap;
import java.util.Map;

public class UserDAOImpl implements UserDAO {
    private Map<Integer, User> database = new HashMap<>();

    public void insert(User user) {
        database.put(user.getId(), user);
        System.out.println("插入用户：" + user.getName());
    }

    public User findById(int id) {
        System.out.println("根据 ID 查询用户：" + id);
        return database.get(id);
    }

    public void update(User user) {
        database.put(user.getId(), user);
        System.out.println("更新用户：" + user.getName());
    }

    public void delete(int id) {
        User removed = database.remove(id);
        System.out.println("删除用户：" + (removed != null ? removed.getName() : "未知"));
    }
}