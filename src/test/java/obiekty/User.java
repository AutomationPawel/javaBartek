package obiekty;

public class User {

    public String userName;
    public String password;

    public User(){
        System.out.println("hello z konstruktora");
    }

    public User(String user, String pass){
        this.userName = user;
        this.password = pass;
    }

    public void sayHello(){
        System.out.println("hello my name is " + userName);
    }
}
