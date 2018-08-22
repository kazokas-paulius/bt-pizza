package lt.baltictalents.pizzeria;

import lt.baltictalents.pizzeria.pizzeria_menus.MenuChoices;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static lt.baltictalents.pizzeria.pizzeria_menus.MenuChoices.mainMenuChoices;

public class PizzeriaMain {

    public static void main(String[] args) throws IOException {
        System.out.println(getDateTime());
        MenuChoices.mainMenuMenu();
        mainMenuChoices();
    }
    private static String getDateTime () {

        return LocalDateTime.now().plusMinutes(10).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

    }
}
