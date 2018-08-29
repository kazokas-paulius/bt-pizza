package lt.baltictalents.pizzeria.DataTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTime {
    public static String getDateTime () {

        return "\n" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
                + "\norder will expire in 10 minutes\n" +
                LocalDateTime.now().plusMinutes(10).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

    }

}
