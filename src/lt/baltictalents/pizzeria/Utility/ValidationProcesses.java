package lt.baltictalents.pizzeria.Utility;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static lt.baltictalents.pizzeria.pizzeria_menus.MenuChoices.addProductsToOrder;
import static lt.baltictalents.pizzeria.pizzeria_menus.MenuChoices.mainMenuChoices;
import static lt.baltictalents.pizzeria.pizzeria_menus.MenuChoices.orderMenuChoices;

public class ValidationProcesses {
    public static void validInput(boolean mainMenu, boolean productInput, String input) throws IOException {
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(input);
        boolean found = matcher.find();

        while (found == true) {
            if(mainMenu && !productInput){
                System.out.println("Given value is invalid. Input one of given numbers");
                mainMenuChoices();
            }
            else if(!mainMenu && !productInput){
                System.out.println("Given value is invalid. Input one of given numbers");
                orderMenuChoices();
            }
            else if(!mainMenu && productInput){
                System.out.println("Given value is invalid. Input one of given numbers");
                addProductsToOrder();
            }
        }
    }

}
