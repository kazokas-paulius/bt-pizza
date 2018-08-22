package lt.baltictalents.pizzeria.pizzeria_menus;

import lt.baltictalents.pizzeria.PizzeriaMain;

import java.io.IOException;
import java.util.Scanner;

import static lt.baltictalents.pizzeria.read_txt.TxtReader.readMenuTxt;

public class MenuChoices {
    public static void mainMenuMenu() {
        System.out.println("Menu\n");
        System.out.println("1 -> Food");
        System.out.println("2 -> Drinks");
        System.out.println("3 -> Check");
        System.out.println("4 -> Cancel order\n");
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
                foodMenu();
                break;
            case 2:
                drinksMenu();
                break;
            case 3:
                System.out.println("Coming soon");
                break;
            case 4:
                System.out.println("Order is canceled. Thanks for choosing us!");
                break;
            default:

                System.out.println("Invalid. Input different number");
//                    caseInput.nextInt();
                mainMenuChoices();
        }

    }

    private static void foodMenu() throws IOException {
        Scanner caseInput = new Scanner(System.in);

        System.out.println("\nFood");
        readMenuTxt("resources/Food");

        System.out.print("\nWhat would you like to oder?\n");
        System.out.println("(6 -> Go back )");

        while (!caseInput.hasNextInt()) { //checks if its int
            System.out.println("Invalid. Input different number");
            caseInput.next();
        }
        int choices = caseInput.nextInt();
        switch (choices) {
            case 1:
                System.out.println("You ordered : Pizza");
                PizzeriaMain.main(null);
                break;
            case 2:
                System.out.println("You ordered : Salad");
                PizzeriaMain.main(null);
                break;
            case 3:
                System.out.println("You ordered : Tortilla");
                PizzeriaMain.main(null);
                break;
            case 4:
                System.out.println("You ordered : Ice cream");
                PizzeriaMain.main(null);
                break;
            case 5:
                System.out.println("You ordered : Soup");
                PizzeriaMain.main(null);
                break;
            case 6:
                System.out.println("Your order : ");
                PizzeriaMain.main(null);// cia vietoj null bus perduodamas masyvas su pridetomis reiksmemis
            default:
                System.out.println("Invalid. Input different number");
                foodMenu();
//                caseInput.next(); //without cycle it ends program.
        }
    }


    private static void drinksMenu() throws IOException {

        Scanner caseInput = new Scanner(System.in);

        System.out.println("\nDrinks");
        readMenuTxt("resources/Drinks");

        System.out.print("\nWhat would you like to order?\n");
        System.out.println("(6 -> Go back )");

        while (!caseInput.hasNextInt()) {
            System.out.println("Invalid. Input different number");
            caseInput.next();
        }
        int choices = caseInput.nextInt();

        switch (choices) {
            case 1:
                System.out.println("You ordered : Beer");
                PizzeriaMain.main(null);
                break;
            case 2:
                System.out.println("You ordered : Root beer");
                PizzeriaMain.main(null);
                break;
            case 3:
                System.out.println("You ordered : Sparkling water");
                PizzeriaMain.main(null);
                break;
            case 4:
                System.out.println("You ordered : Still water");
                PizzeriaMain.main(null);
                break;
            case 5:
                System.out.println("You ordered : Juice");
                PizzeriaMain.main(null);
                break;
            case 6:
                System.out.println("Your order : ");
                PizzeriaMain.main(null);// cia vietoj null bus perduodamas masyvas su pridetomis reiksmemis
            default:
                System.out.println("Invalid. Input different number");
                drinksMenu();
        }
    }
}

