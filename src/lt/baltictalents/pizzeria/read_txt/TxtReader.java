package lt.baltictalents.pizzeria.read_txt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class TxtReader {

    public static void readMaistasTxt() throws IOException {
        File mFile = new File("resources/Maistas");
        BufferedReader mBr = new BufferedReader(new FileReader(mFile));
        String mContent;

        while ((mContent = mBr.readLine()) != null) {
            System.out.println(mContent);
            String[] mNeimai = mContent.split(" ");
            List<String> mNames = Collections.singletonList(mNeimai[1]);
            List<String> mPrices = Collections.singletonList(mNeimai[mNeimai.length - 1]);
            System.out.println(mNames);
            System.out.println(mPrices);
        }
    }

    public static void readDrinksTxt() throws IOException {
        File gFile = new File("resources/Gerimai");
        BufferedReader gBr = new BufferedReader(new FileReader(gFile));
        String gContent;

        while ((gContent = gBr.readLine()) != null) {
            System.out.println(gContent);
            String[] gNeimai = gContent.split(" ");
            List<String> gNames = Collections.singletonList(gNeimai[1]);
            List<String> gPrices = Collections.singletonList(gNeimai[gNeimai.length - 1]);
            System.out.println(gNames);
            System.out.println(gPrices);
        }
    }

}

