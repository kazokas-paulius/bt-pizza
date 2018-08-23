package lt.baltictalents.pizzeria.pizzeria_menus;

import lt.baltictalents.pizzeria.Food.MenuItem;
import lt.baltictalents.pizzeria.PizzeriaMain;
import lt.baltictalents.pizzeria.maisto_meniu.DrinkMenuMethods;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static lt.baltictalents.pizzeria.read_txt.TxtReader.readMenuTxt;

public class MenuChoices {

    private static DrinkMenuMethods dMM = new DrinkMenuMethods();
    private static List<MenuItem> foodListMenu;
    private static List<MenuItem> drinkListMenu;

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
//                    caseInput.nextInt();
                mainMenuChoices();
        }
    }

    private static void productsMenu() throws IOException {
        Scanner caseInput = new Scanner(System.in);

        System.out.println("\nInput a number");
//        foodListMenu = readMenuTxt(false, "resources/Food");

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
                System.out.println("You ordered : Beer");
//                dMM.addDrinks("Beer");
                System.out.println("Added Beer");
                dMM.addDrinkss("Beer", 1.20);
//                dMM.addDrinkss("Beer", 1.20).toString();
//                Set<String> beers = new TreeSet<>();
//                int beerCount = 0;
//                if(beerCount == 0){
//                    beers.add(dMM.addDrinkss("Beer", 1.20).toString());
//                }
//                else if(beerCount > 0){
//                    // ..cia prideti i gala
//                }
//                String[] beerTest = beers.toArray(new String[beers.size()]);
//                System.out.println("beerTest" + Arrays.toString(beerTest));
//
//                PizzeriaMain.main(beerTest);
                PizzeriaMain.main(null);
                break;
            case 7:
                System.out.println("You ordered : Root beer");
                PizzeriaMain.main(null);
                break;
            case 8:
                System.out.println("You ordered : Sparkling water");
                PizzeriaMain.main(null);
                break;
            case 9:
                System.out.println("You ordered : Still water");
                PizzeriaMain.main(null);
                break;
            case 10:
                System.out.println("You ordered : Juice");
                PizzeriaMain.main(null);
                break;
            case 11:
                System.out.println("Your order : ");
                PizzeriaMain.main(null);// cia vietoj null bus perduodamas masyvas su pridetomis reiksmemis
            default:
                System.out.println("Invalid. Input different number");
                productsMenu();
        }
    }
}

