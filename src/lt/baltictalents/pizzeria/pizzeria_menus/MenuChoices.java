package lt.baltictalents.pizzeria.pizzeria_menus;

import lt.baltictalents.pizzeria.PizzeriaMain;

import java.io.IOException;
import java.util.Scanner;

import static lt.baltictalents.pizzeria.read_txt.TxtReader.readDrinksTxt;
import static lt.baltictalents.pizzeria.read_txt.TxtReader.readMaistasTxt;

public class MenuChoices {

    public static void mainMeniuMeniu() {
        System.out.println("Meniu\n");
        System.out.println("1 -> Maistas");
        System.out.println("2 -> Gerimai");
        System.out.println("3 -> Čekiukas");
        System.out.println("4 -> Išeiti\n");
        System.out.print("Pasirinkimas:");
    }

    public static void mainMenuChoices() throws IOException {
        Scanner caseInput = new Scanner(System.in);
        int choices = caseInput.nextInt();

        switch (choices) {
            case 1:
                maistoMeniu();
                break;
            case 2:
                gerimuMeniu();
                break;
            case 3:
                System.out.println("Coming soon");
                break;
            case 4:
                System.out.println("Išėjote iš užsakymo");
                break;
        }
    }

    private static void maistoMeniu() throws IOException {
        Scanner caseInput = new Scanner(System.in);

        System.out.println("\nMaistas");
        readMaistasTxt();

        System.out.print("\nKą norėtumėte įsidėti į krepšelį?\n");
        System.out.println("(6 -> Sugrįžti atgal)");
        int choices = caseInput.nextInt();

        switch (choices) {
            case 1:
                System.out.println("Pasirinktas patiekalas: Pica");
                PizzeriaMain.main(null);
                break;
            case 2:
                System.out.println("Pasirinktas patiekalas: Salotos");
                PizzeriaMain.main(null);
                break;
            case 3:
                System.out.println("Pasirinktas patiekalas: Tortilija");
                PizzeriaMain.main(null);
                break;
            case 4:
                System.out.println("Pasirinktas patiekalas: Ledai");
                PizzeriaMain.main(null);
                break;
            case 5:
                System.out.println("Pasirinktas patiekalas: Sriuba");
                PizzeriaMain.main(null);
                break;
            case 6:
                System.out.println("Sugrįžote Atgal");
                PizzeriaMain.main(null);// cia vietoj null bus perduodamas masyvas su pridetomis reiksmemis
        }
    }

    private static void gerimuMeniu() throws IOException {

        Scanner caseInput = new Scanner(System.in);

        System.out.println("\nGėrimai");
        readDrinksTxt();

        System.out.print("\nKą norėtumėte įsidėti į krepšelį?\n");
        System.out.println("(6 -> Sugrįžti atgal)");
        int choices = caseInput.nextInt();

        switch (choices) {
            case 1:
                System.out.println("Pasirinktas gėrimas: Alus");
                PizzeriaMain.main(null);
                break;
            case 2:
                System.out.println("Pasirinktas gėrimas: Gira");
                PizzeriaMain.main(null);
                break;
            case 3:
                System.out.println("Pasirinktas gėrimas: Mineralinis");
                PizzeriaMain.main(null);
                break;
            case 4:
                System.out.println("Pasirinktas gėrimas: Vanduo");
                PizzeriaMain.main(null);
                break;
            case 5:
                System.out.println("Pasirinktas gėrimas: Sultys");
                PizzeriaMain.main(null);
                break;
            case 6:
                System.out.println("Sugrįžote Atgal");
                PizzeriaMain.main(null);// cia vietoj null bus perduodamas masyvas su pridetomis reiksmemis
        }
    }
}
