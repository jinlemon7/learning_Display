public class Client {
    public static void main(String[] args) {
        UserServiceFacade userService = new UserServiceFacade();

        userService.createUser(1, "鱼皮");
        userService.viewUser(1);
        userService.renameUser(1, "Yes");
        userService.viewUser(1);
        userService.removeUser(1);
        userService.viewUser(1);
    }
}