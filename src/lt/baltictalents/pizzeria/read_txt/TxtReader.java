package lt.baltictalents.pizzeria.read_txt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class TxtReader {
    public static void readMeniuTxt(String fPath) throws IOException{
        File fTarget = new File(fPath);
        BufferedReader bfr = new BufferedReader(new FileReader(fTarget));
        String fContent;

        while ((fContent = bfr.readLine()) != null) {
            System.out.println(fContent);
            String[] mName = fContent.split(" ");
            List<String> mNames = Collections.singletonList(mName[1]);
            List<String> mPrices = Collections.singletonList(mName[mName.length - 1]);
            System.out.println(mNames);
            System.out.println(mPrices);
        }
    }
}

