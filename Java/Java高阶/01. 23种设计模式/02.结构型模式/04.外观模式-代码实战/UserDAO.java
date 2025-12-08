public interface UserDAO {
    void insert(User user);
    User findById(int id);
    void update(User user);
    void delete(int id);
}