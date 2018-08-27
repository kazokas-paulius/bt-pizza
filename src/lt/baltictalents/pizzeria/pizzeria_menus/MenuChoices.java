package lt.baltictalents.pizzeria.pizzeria_menus;

import lt.baltictalents.pizzeria.Food.MenuItem;

import java.io.IOException;
import java.util.*;

import static lt.baltictalents.pizzeria.read_txt.TxtReader.readMenuTxt;

public class MenuChoices {

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
        System.out.println("3 -> Order Options\n");
        System.out.print("Input number:");
    }

    private static void orderMenuMenu(){
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
        int choices = caseInput.nextInt();

        switch (choices) {
            case 1:
                addProductsToOrder();
                break;
            case 2:
                System.out.println("Your order");
                System.out.println(getCustomOrder());
                mainMenuMenu();
                mainMenuChoices();
                break;
            case 3:
                orderMenuMenu();
                orderMenuChoices();
                break;
            default:
                System.out.print("Invalid. Input different number");
//                caseInput.nextInt();
                mainMenuChoices();
        }
    }

    private static void orderMenuChoices() throws IOException{

        Scanner orderInput = new Scanner(System.in);

        while (!orderInput.hasNextInt()) {
            System.out.println("Invalid. Input different number");
            orderInput.next();
        }

        int choices = orderInput.nextInt();

        switch (choices){
            case 1:
                System.out.println("View Order");
                System.out.println(getCustomOrder());
                orderMenuMenu();
                orderMenuChoices();
                break;
            case 2:
                System.out.println("Remove Item from Order");
                removeProductsFromOrder();
                orderMenuChoices();
                break;
            case 3:
                System.out.println("Confirm Order");
//                confirmOrder();
                orderMenuChoices();
                break;
            case 4:
                System.out.println("Cancel Order");
                cancelOrder();
                orderMenuChoices();
                break;
            case 5:
                System.out.println("Back to Menu");
                mainMenuMenu();
                mainMenuChoices();
                break;
        }
    }

    private static void addProductsToOrder() throws IOException {
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
                addProductsToOrder();
                break;
            case 2:
                System.out.println("You ordered : Salad");
                customOrder.add(foodListMenu.get(1));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case 3:
                System.out.println("You ordered : Tortilla");
                customOrder.add(foodListMenu.get(2));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case 4:
                System.out.println("You ordered : Ice cream");
                customOrder.add(foodListMenu.get(3));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case 5:
                System.out.println("You ordered : Soup");
                customOrder.add(foodListMenu.get(4));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case 6:
                System.out.println("You ordered : Beer");
                customOrder.add(drinkListMenu.get(0));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case 7:
                System.out.println("You ordered : Root beer");
                customOrder.add(drinkListMenu.get(1));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case 8:
                System.out.println("You ordered : Sparkling water");
                customOrder.add(drinkListMenu.get(2));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case 9:
                System.out.println("You ordered : Still water");
                customOrder.add(drinkListMenu.get(3));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case 10:
                System.out.println("You ordered : Juice");
                customOrder.add(drinkListMenu.get(4));
                System.out.println(customOrder);
                addProductsToOrder();
                break;
            case 11:
                mainMenuMenu();
                mainMenuChoices();
                break;
            default:
                System.out.println("Invalid. Input different number");
                mainMenuMenu();
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
        orderMenuChoices();
        orderMenuChoices();
    }

    private static void cancelOrder() throws IOException{
        System.out.println("Your order canceled");

        customOrder.clear();

        System.out.println(customOrder);
        orderMenuMenu();
        orderMenuChoices();
    }
}

