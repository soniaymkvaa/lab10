package singleton;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Sofia", "syamkova@gmail.com", 18);
        user.save();
    }
}
