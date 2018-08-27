package lt.baltictalents.pizzeria.DataTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTime {
    public static String getDateTime () {

        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
                + "\n order will expire in: " +
                LocalDateTime.now().plusMinutes(10).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

    }

}
