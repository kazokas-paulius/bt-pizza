package lt.baltictalents.pizzeria.CheckOut;

import lt.baltictalents.pizzeria.Food.MenuItem;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Check {

    public static void sortOrderProductName(List<MenuItem> mi){
        Collections.sort(mi, new Comparator<MenuItem>() {
            @Override
            public int compare(MenuItem pName1, MenuItem pName2) {
                return pName1.getName().compareTo(pName2.getName());
            }
        });
    }

    public static String orderPrice(List<MenuItem> mi){

        DecimalFormat dc = new DecimalFormat("#0.00");
        double price = 0.0;

        for(MenuItem i : mi){
            price += i.getPrice();
        }

        return dc.format(price);
    }
}
