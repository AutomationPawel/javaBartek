package obiekty;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        User user2 = new User("Paweł", "Pass");

        user.userName = "bartek";
        user.password = "pass";
        user.sayHello();

        user2.sayHello();
    }
}
