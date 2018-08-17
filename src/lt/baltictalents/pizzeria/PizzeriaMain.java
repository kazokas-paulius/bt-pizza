package lt.baltictalents.pizzeria;

import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.util.List;
import java.util.Arrays;

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
                    String[] mNeimai = mContent.split(" ");
                    List<String> mNames = Arrays.asList(mNeimai[1]);
                    List<String> mPrices = Arrays.asList(mNeimai[mNeimai.length-1]);
                    System.out.println(mNames);
                    System.out.println(mPrices);
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

                while ((mContent = gBr.readLine()) != null) {
                    System.out.println(mContent);
                    String[] gNeimai = mContent.split(" ");
                    List<String> gNames = Arrays.asList(gNeimai[1]);
                    List<String> gPrices = Arrays.asList(gNeimai[gNeimai.length-1]);
                    System.out.println(gNames);
                    System.out.println(gPrices);
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
