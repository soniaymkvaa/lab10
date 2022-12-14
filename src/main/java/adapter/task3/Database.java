package adapter.task3;
import lombok.Getter;

@Getter
public class Database {
    private БазаДаних базаДаних = new БазаДаних();

    public String getUserData() {
        return базаДаних.отриматиДаніКористувача();
    }

    public String getStatistics() {
        return базаДаних.отриматиСтатистичніДані();
    }
}