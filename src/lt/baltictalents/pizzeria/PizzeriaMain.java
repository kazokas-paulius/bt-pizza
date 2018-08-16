package lt.baltictalents.pizzeria;

import java.util.Scanner;
import java.io.*;
import java.io.File;

public class PizzeriaMain {

    public static void main(String[] args) throws IOException {

        System.out.println("Meniu\n");
        System.out.println("1 -> Maistas");
        System.out.println("2 -> Gerimai");
        System.out.println("3 -> Čekiukas");
        System.out.println("4 -> Išeiti\n");
        System.out.print("Pasirinkimas:");

        Scanner caseInput = new Scanner(System.in);
        int choises = caseInput.nextInt();

        switch (choises) {
            case 1:
                System.out.println("\nMaistas");
                File mfile = new File("resources/Maistas");
                BufferedReader mBr = new BufferedReader(new FileReader(mfile));
                String mContent;

                while ((mContent = mBr.readLine()) != null) {
                    System.out.println(mContent);
                }
                System.out.print("\nKą norėtumėte įsidėti į krepšelį?\n");
                System.out.println("(6 -> Sugrįžti atgal)");
                choises = caseInput.nextInt();

                switch(choises){
                    case 1:
                        System.out.println("Pasirinktas patiekalas: Pica");
                        break;
                    case 2:
                        System.out.println("Pasirinktas patiekalas: Salotos");
                        break;
                    case 3:
                        System.out.println("Pasirinktas patiekalas: Tortilija");
                        break;
                    case 4:
                        System.out.println("Pasirinktas patiekalas: Ledai");
                        break;
                    case 5:
                        System.out.println("Pasirinktas patiekalas: Sriuba");
                        break;
                    case 6:
                        System.out.println("Sugrįžote Atgal");
                        main(null);// cia vietoj null bus perduodamas masyvas su pridetomis reiksmemis
                }
                break;
            case 2:
                System.out.println("\nGėrimai");
                File gfile = new File("resources/Gerimai");
                BufferedReader gBr = new BufferedReader(new FileReader(gfile));
                String gContent;

                while ((gContent = gBr.readLine()) != null) {
                    System.out.println(gContent);
                }
                System.out.print("\nKą norėtumėte įsidėti į krepšelį?\n");
                System.out.println("(6 -> Sugrįžti atgal)");
                choises = caseInput.nextInt();

                switch (choises) {
                    case 1:
                        System.out.println("Pasirinktas gėrimas: Alus");
                        break;
                    case 2:
                        System.out.println("Pasirinktas gėrimas: Gira");
                        break;
                    case 3:
                        System.out.println("Pasirinktas gėrimas: Mineralinis");
                        break;
                    case 4:
                        System.out.println("Pasirinktas gėrimas: Vanduo");
                        break;
                    case 5:
                        System.out.println("Pasirinktas gėrimas: Sultys");
                        break;
                    case 6:
                        System.out.println("Sugrįžote Atgal");
                        main(null);// cia vietoj null bus perduodamas masyvas su pridetomis reiksmemis
                }
                break;
            case 3:
                System.out.println("Coming soon");
            case 4:
                System.out.println("Išėjote iš užsakymo");
                break;
        }
    }
}
