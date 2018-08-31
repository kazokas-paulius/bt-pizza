package lt.baltictalents.pizzeria.DataTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTime {
    public static String getDateTime () {

        String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String expireTime = LocalDateTime.now().plusMinutes(10).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        return "\n" + currentTime + "\norder will expire in 10 minutes\n" + expireTime;

    }
}
