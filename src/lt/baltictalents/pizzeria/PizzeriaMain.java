package lt.baltictalents.pizzeria;

import java.util.Collections;
import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.util.List;
//august 20 - padariau kad galetum jumpint i maina po kiekvieno pasirinkimo,
//pašalinau warningus ir typos,
//pakeiciau Arrays.asList i Collections.singletonList(), paaiskinimas apacioj rasi kazkur.
//kazkas nepatinka keisk ,tik buk gerutis pakomentuok naujienas, daug laiko prireike kad susigaudyt kur kas
//del masyvu tai dar nesugalvojau kaip padaryt, ryt galesim pagalvot draugiskai

public class PizzeriaMain {

    public static void main(String[] args) throws IOException {

        mainMenu mM = new mainMenu();
        mM.mainMeniuMeniu();

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
        File mfile = new File("resources/Maistas");
        BufferedReader mBr = new BufferedReader(new FileReader(mfile));
        String mContent;

        while ((mContent = mBr.readLine()) != null) {
            System.out.println(mContent);
            String[] mNeimai = mContent.split(" ");
            List<String> mNames = Collections.singletonList(mNeimai[1]);
            //Reports any calls to Arrays.asList()
            // with zero arguments or only one argument. Such calls could be replaced with either a
            // call to Collections.singletonList() or Collections.emptyList() which will save some memory.
            List<String> mPrices = Collections.singletonList(mNeimai[mNeimai.length - 1]);
            System.out.println(mNames);
            System.out.println(mPrices);
        }

        System.out.print("\nKą norėtumėte įsidėti į krepšelį?\n");
        System.out.println("(6 -> Sugrįžti atgal)");
        int choices = caseInput.nextInt();

        switch (choices) {
            case 1:
                System.out.println("Pasirinktas patiekalas: Pica");
                main(null);
                break;
            case 2:
                System.out.println("Pasirinktas patiekalas: Salotos");
                main(null);
                break;
            case 3:
                System.out.println("Pasirinktas patiekalas: Tortilija");
                main(null);
                break;
            case 4:
                System.out.println("Pasirinktas patiekalas: Ledai");
                main(null);
                break;
            case 5:
                System.out.println("Pasirinktas patiekalas: Sriuba");
                main(null);
                break;
            case 6:
                System.out.println("Sugrįžote Atgal");
                main(null);// cia vietoj null bus perduodamas masyvas su pridetomis reiksmemis
        }
    }

    private static void gerimuMeniu() throws IOException {

        Scanner caseInput = new Scanner(System.in);

        System.out.println("\nGėrimai");
        File gfile = new File("resources/Gerimai");
        BufferedReader gBr = new BufferedReader(new FileReader(gfile));
        String gContent;

        while ((gContent = gBr.readLine()) != null) {
            System.out.println(gContent);
            String[] gNeimai = gContent.split(" ");
            List<String> gNames = Collections.singletonList(gNeimai[1]);
            List<String> gPrices = Collections.singletonList(gNeimai[gNeimai.length - 1]);
            System.out.println(gNames);
            System.out.println(gPrices);
        }

        System.out.print("\nKą norėtumėte įsidėti į krepšelį?\n");
        System.out.println("(6 -> Sugrįžti atgal)");
        int choices = caseInput.nextInt();

        switch (choices) {
            case 1:
                System.out.println("Pasirinktas gėrimas: Alus");
                main(null);
                break;
            case 2:
                System.out.println("Pasirinktas gėrimas: Gira");
                main(null);
                break;
            case 3:
                System.out.println("Pasirinktas gėrimas: Mineralinis");
                main(null);
                break;
            case 4:
                System.out.println("Pasirinktas gėrimas: Vanduo");
                main(null);
                break;
            case 5:
                System.out.println("Pasirinktas gėrimas: Sultys");
                main(null);
                break;
            case 6:
                System.out.println("Sugrįžote Atgal");
                main(null);// cia vietoj null bus perduodamas masyvas su pridetomis reiksmemis
        }
    }


    static class mainMenu {
        void mainMeniuMeniu() {
            System.out.println("Meniu\n");
            System.out.println("1 -> Maistas");
            System.out.println("2 -> Gerimai");
            System.out.println("3 -> Čekiukas");
            System.out.println("4 -> Išeiti\n");
            System.out.print("Pasirinkimas:");
        }
    }
}
