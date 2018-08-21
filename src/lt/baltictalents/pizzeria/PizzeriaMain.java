package lt.baltictalents.pizzeria;

import lt.baltictalents.pizzeria.pizzeria_menus.MenuChoices;

import java.io.*;

import static lt.baltictalents.pizzeria.pizzeria_menus.MenuChoices.mainMenuChoices;

public class PizzeriaMain {

    public static void main(String[] args) throws IOException {

        MenuChoices.mainMenuMenu();
        mainMenuChoices();
    }
}
