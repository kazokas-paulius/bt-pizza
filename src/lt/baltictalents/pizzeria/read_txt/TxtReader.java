package lt.baltictalents.pizzeria.read_txt;

import lt.baltictalents.pizzeria.Food.Drink;
import lt.baltictalents.pizzeria.Food.Food;
import lt.baltictalents.pizzeria.Food.MenuItem;

import java.io.*;
import java.util.*;


public class TxtReader {
    public static List<MenuItem> readMenuTxt(boolean drink, String fPath) throws IOException {
        File fTarget = new File(fPath);
        BufferedReader bfr = new BufferedReader(new FileReader(fTarget));
        String fContent;
        List<MenuItem> menuList = new ArrayList<>();


        while ((fContent = bfr.readLine()) != null) {
            String[] mName = fContent.split("##");
            if (drink) {
                menuList.add(new Drink(Integer.valueOf(mName[0]), mName[1], Double.valueOf(mName[2])));
            } else {
                menuList.add(new Food(Integer.valueOf(mName[0]), mName[1], Double.valueOf(mName[2])));
            }
        }
        System.out.println(menuList.toString().replace("[", "").replace("]", "").replace(",", ""));
        bfr.close();
        return menuList;
    }
}