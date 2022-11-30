package adapter.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class TwitterUser {
    private String email;
    private String userCountry;
    private String UserActiveTime;
}
