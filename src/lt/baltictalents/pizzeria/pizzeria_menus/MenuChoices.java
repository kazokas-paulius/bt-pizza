package lt.baltictalents.pizzeria.pizzeria_menus;

import lt.baltictalents.pizzeria.Food.MenuItem;
import lt.baltictalents.pizzeria.maisto_meniu.DrinkMenuMethods;

import java.io.IOException;
import java.util.*;

import static lt.baltictalents.pizzeria.read_txt.TxtReader.readMenuTxt;

public class MenuChoices {

    private static DrinkMenuMethods dMM = new DrinkMenuMethods();
    private static List<MenuItem> foodListMenu;
    private static List<MenuItem> drinkListMenu;
    private static List<MenuItem> customOrder = new ArrayList<>();

    public static List<MenuItem> getCustomOrder() {
        return customOrder;
    }

    static {
        try {
            foodListMenu = readMenuTxt(false, "resources/Food");
            drinkListMenu = readMenuTxt(true, "resources/Drinks");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mainMenuMenu() {
        System.out.println("Menu\n");
        System.out.println("1 -> Add product");
        System.out.println("2 -> Check");
        System.out.println("3 -> Cancel order\n");
        System.out.print("Input number:");
    }

    public static void mainMenuChoices() throws IOException {

        Scanner caseInput = new Scanner(System.in);

        while (!caseInput.hasNextInt()) {
            System.out.println("Invalid. Input different number");
            caseInput.next();
        }
        int choices = caseInput.nextInt();

        switch (choices) {
            case 1:
                productsMenu();
                break;
            case 2:
                System.out.println("Coming soon");
                break;
            case 3:
                System.out.println("Order is canceled. Thanks for choosing us!");
                break;
            default:
                System.out.println("Invalid. Input different number");
//                caseInput.nextInt();
                mainMenuChoices();
        }
    }

    private static void productsMenu() throws IOException {
        Scanner caseInput = new Scanner(System.in);
        System.out.print("\nWhat would you like to oder?\n");
        System.out.println("\nInput a number");
        System.out.println("11 -> Go Back");
        while (!caseInput.hasNextInt()) {
            System.out.println("Invalid. Input different number");
            caseInput.next();
        }
        int choices = caseInput.nextInt();
        switch (choices) {
            case 1:
                System.out.println("You ordered : Pizza");
                customOrder.add(foodListMenu.get(0));
                System.out.println(customOrder);
                productsMenu();
                break;
            case 2:
                System.out.println("You ordered : Salad");
                customOrder.add(foodListMenu.get(1));
                System.out.println(customOrder);
                productsMenu();
                break;
            case 3:
                System.out.println("You ordered : Tortilla");
                customOrder.add(foodListMenu.get(2));
                System.out.println(customOrder);
                productsMenu();
                break;
            case 4:
                System.out.println("You ordered : Ice cream");
                customOrder.add(foodListMenu.get(3));
                System.out.println(customOrder);
                productsMenu();
                break;
            case 5:
                System.out.println("You ordered : Soup");
                customOrder.add(foodListMenu.get(4));
                System.out.println(customOrder);
                productsMenu();
                break;
            case 6:
                System.out.println("You ordered : Beer");
                customOrder.add(drinkListMenu.get(0));
                System.out.println(customOrder);
                productsMenu();
                break;
            case 7:
                System.out.println("You ordered : Root beer");
                customOrder.add(drinkListMenu.get(1));
                System.out.println(customOrder);
                productsMenu();
                break;
            case 8:
                System.out.println("You ordered : Sparkling water");
                customOrder.add(drinkListMenu.get(2));
                System.out.println(customOrder);
                productsMenu();
                break;
            case 9:
                System.out.println("You ordered : Still water");
                customOrder.add(drinkListMenu.get(3));
                System.out.println(customOrder);
                productsMenu();
                break;
            case 10:
                System.out.println("You ordered : Juice");
                customOrder.add(drinkListMenu.get(4));
                System.out.println(customOrder);
                productsMenu();
                break;
            case 11:
                System.out.println("Go Back to Menu");
                mainMenuChoices();
            case 12:
                getCustomOrder();
                System.out.println(getCustomOrder());
            default:
                System.out.println("Invalid. Input different number");
                productsMenu();
        }
    }
}

