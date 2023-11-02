package src;

public class UserTest {
    public static void main(String[] args) {
        //User user =  new User();
        User user2 = new User("Tomek", "Hello");
        System.out.println(user2.username);
        System.out.println(user2.password);
        user2.sayHello();
//        user.username = "Bartek";
//        user.password = "Pop";
//        user.sayHello();


    }
}
