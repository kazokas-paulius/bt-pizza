package lt.baltictalents.pizzeria;

import java.util.Scanner;
import java.io.*;

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
                String maistasPath = "C:\\Users\\pauli\\OneDrive\\Desktop\\Kraken\\JAVA\\Baltic-Talents-Java\\bt-pizza\\src\\Maistas";
                File mfile = new File(maistasPath);
                String mAbsoluteFile = mfile.getAbsolutePath();
                BufferedReader mBr = new BufferedReader(new FileReader(mAbsoluteFile));
                String mContent;

                while ((mContent = mBr.readLine()) != null) {
                    System.out.println(mContent);
                }
//                System.out.print("\nKą norėtumėte įsidėti į krepšelį?");
//                choises = caseInput.nextInt();
                break;
            case 2:
                System.out.println("\nGėrimai");
                String filePath = "C:\\Users\\pauli\\OneDrive\\Desktop\\Kraken\\JAVA\\Baltic-Talents-Java\\bt-pizza\\src\\Gerimai";
                File file = new File(filePath);
                String absoluteFile = file.getAbsolutePath();
                BufferedReader gBr = new BufferedReader(new FileReader(absoluteFile));
                String gContent;

                while ((gContent = gBr.readLine()) != null) {
                    System.out.println(gContent);
                }
                System.out.print("\nKą norėtumėte įsidėti į krepšelį?");
                choises = caseInput.nextInt();
                caseInput.nextLine();

                switch (choises) {
                    case 1:
                        System.out.println("Pridėtas Alus");
                        break;
                    case 2:
                        System.out.println("Pridėtas Gira");
                        break;
                    case 3:
                        System.out.println("Pridėtas Mineralinis");
                        break;
                    case 4:
                        System.out.println("Pridėtas Vanduo");
                        break;
                    case 5:
                        System.out.println("Pridėtas Sultys");
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
//                return;
        }
    }
}
