package lt.baltictalents.pizzeria.read_txt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class TxtReader {

    public static void readFoodTxt() throws IOException {
        File mFile = new File("resources/Food");
        BufferedReader mBr = new BufferedReader(new FileReader(mFile));
        String mContent;

        while ((mContent = mBr.readLine()) != null) {
            System.out.println(mContent);
            String[] mName = mContent.split(" ");
            List<String> mNames = Collections.singletonList(mName[1]);
            List<String> mPrices = Collections.singletonList(mName[mName.length - 1]);
            System.out.println(mNames);
            System.out.println(mPrices);
        }
    }

    public static void readDrinksTxt() throws IOException {
        File gFile = new File("resources/Drinks");
        BufferedReader gBr = new BufferedReader(new FileReader(gFile));
        String gContent;

        while ((gContent = gBr.readLine()) != null) {
            System.out.println(gContent);
            String[] gName = gContent.split(" ");
            List<String> gNames = Collections.singletonList(gName[1]);
            List<String> gPrices = Collections.singletonList(gName[gName.length - 1]);
            System.out.println(gNames);
            System.out.println(gPrices);
        }
    }

}

