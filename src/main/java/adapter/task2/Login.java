package adapter.task2;

import java.time.LocalDate;

public class Login {
    public Client login(String loginMethod) {
        if (loginMethod.equals("twitter")) {
            return new TwitterClient(new TwitterUser("syamkova@gmail.com", "Ukraine", "2022-11-21"));
        } else if (loginMethod.equals("facebook")) {
            return new FacebookClient(new FacebookUser("syamkova@gmail.com", Country.Ukraine, LocalDate.now()));
        }
        throw new IllegalArgumentException("No such loginMethod");
    }
}
