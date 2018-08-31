
package lt.baltictalents.pizzeria.pizzeria_menus;

import lt.baltictalents.pizzeria.CheckOut.Check;
import lt.baltictalents.pizzeria.DataTime.DataTime;
import lt.baltictalents.pizzeria.Food.MenuItem;

import java.io.IOException;
import java.util.*;


import static lt.baltictalents.pizzeria.CheckOut.Check.orderPrice;
import static lt.baltictalents.pizzeria.Utility.ValidationProcesses.validInput;
import static lt.baltictalents.pizzeria.read_txt.TxtReader.readMenuTxt;

public class MenuChoices {

    private static List<MenuItem> foodListMenu;
    private static List<MenuItem> drinkListMenu;
    private static List<MenuItem> customOrder = new ArrayList<>();

    private static List<MenuItem> getCustomOrder() {
        return customOrder;
    }

    static {
        System.out.println("\n--------Menu--------");
        try {
            foodListMenu = readMenuTxt(false, "resources/Food");
            drinkListMenu = readMenuTxt(true, "resources/Drinks");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mainMenuMenu() {
        System.out.println("\n------------------\n");
        System.out.println("What would you like to do ?\n");
        System.out.println("1 -> Add product");
        System.out.println("2 -> Check");
        System.out.println("3 -> Order Options\n");
        System.out.print("Input number:");
    }

    private static void orderMenuMenu() {
        System.out.println("\n1 -> View order");
        System.out.println("2 -> Remove item from order");
        System.out.println("3 -> Confirm order");
        System.out.println("4 -> Cancel order");
        System.out.println("5 -> Back to menu");
        System.out.print("Input number:");
    }

    public static void mainMenuChoices() throws IOException {

        Scanner caseInput = new Scanner(System.in);

        while (!caseInput.hasNextInt()) {
            System.out.println("Invalid. Input different number");
            caseInput.next();
        }
        String choices = caseInput.nextLine();

        validInput(true, false, choices);

        switch (choices) {
            case "1":
                addProductsToOrder();
                break;
            case "2":
                System.out.println("Your order");
                System.out.println(getCustomOrder());
                mainMenuMenu();
                mainMenuChoices();
                break;
            case "3":
                orderMenuMenu();
                orderMenuChoices();
                break;
            default:
                System.out.print("Invalid. Input different number");
//                caseInput.nextInt();
                mainMenuChoices();
        }
    }

    public static void orderMenuChoices() throws IOException {

        Scanner orderInput = new Scanner(System.in);

        while (!orderInput.hasNextInt()) {
            System.out.println("Invalid. Input different number");
            orderInput.next();
        }

        String choices = orderInput.nextLine();

        validInput(false, false, choices);

        switch (choices) {
            case "1":
                System.out.println("View Order");
                System.out.println(getCustomOrder());
                orderMenuMenu();
                orderMenuChoices();
                break;
            case "2":
                System.out.println("Remove Item from Order");
                removeProductsFromOrder();
                orderMenuMenu();
                orderMenuChoices();
                break;
            case "3":
                System.out.println("Confirm Order");
                confirmOrder();
                break;
            case "4":
                System.out.println("Cancel Order");
                cancelOrder();
                orderMenuMenu();
                orderMenuChoices();
                break;
            case "5":
                System.out.println("Back to Menu");
                mainMenuMenu();
                mainMenuChoices();
                break;
        }
    }

    public static void addProductsToOrder() throws IOException {
        Scanner caseInput = new Scanner(System.in);
        System.out.print("\nWhat would you like to oder?\n");
        System.out.println("\nInput a number");
        System.out.println("11 -> Go Back");
        System.out.println("12 -> See menu");
        while (!caseInput.hasNextInt()) {
            System.out.println("Invalid. Input different number");
            caseInput.next();
        }
        String choices = caseInput.nextLine();
        validInput(false, true, choices);
        switch (choices) {
            case "1":
                System.out.println("You ordered : Pizza");
                customOrder.add(foodListMenu.get(0));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case "2":
                System.out.println("You ordered : Salad");
                customOrder.add(foodListMenu.get(1));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case "3":
                System.out.println("You ordered : Tortilla");
                customOrder.add(foodListMenu.get(2));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case "4":
                System.out.println("You ordered : Ice cream");
                customOrder.add(foodListMenu.get(3));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case "5":
                System.out.println("You ordered : Soup");
                customOrder.add(foodListMenu.get(4));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case "6":
                System.out.println("You ordered : Beer");
                customOrder.add(drinkListMenu.get(0));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case "7":
                System.out.println("You ordered : Root beer");
                customOrder.add(drinkListMenu.get(1));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case "8":
                System.out.println("You ordered : Sparkling water");
                customOrder.add(drinkListMenu.get(2));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case "9":
                System.out.println("You ordered : Still water");
                customOrder.add(drinkListMenu.get(3));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case "10":
                System.out.println("You ordered : Juice");
                customOrder.add(drinkListMenu.get(4));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case "11":
                mainMenuMenu();
                mainMenuChoices();
                break;
            case "12":

                System.out.println("\n--------Menu--------");
                try {
                    foodListMenu = readMenuTxt(false, "resources/Food");
                    drinkListMenu = readMenuTxt(true, "resources/Drinks");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                addProductsToOrder();
                break;
            default:
                System.out.println("Invalid. Input different number");
                addProductsToOrder();
        }
    }

    private static void removeProductsFromOrder() throws IOException {
        System.out.println(getCustomOrder());

        Scanner caseInput = new Scanner(System.in);
        System.out.print("Enter product name you wish to be removed (example: Salad): ");
        String removeWish = caseInput.nextLine();
        System.out.println(removeWish);

        Iterator<MenuItem> itt = customOrder.iterator();

        while (itt.hasNext()) {
            MenuItem mi = itt.next();
            if (removeWish.equals(mi.getName())) {
                itt.remove();
                System.out.println("Removed: " + mi.getName());
                break;
            }
        }

        System.out.println(customOrder);
        orderMenuMenu();
        orderMenuChoices();
    }

    private static void cancelOrder() throws IOException {
        System.out.println("Your order canceled");

        customOrder.clear();

        System.out.println(customOrder);
        orderMenuMenu();
        orderMenuChoices();
    }

    private static void confirmOrder() {
        System.out.println(DataTime.getDateTime());

        System.out.println("Order confirmed\n");
        System.out.println(customOrder);

        Check.sortOrderProductName(customOrder);

        System.out.println("Sorted by order product names\n");
        System.out.println(customOrder);

        System.out.println("Order total price: " + orderPrice(customOrder));

        System.exit(0);
    }

}
