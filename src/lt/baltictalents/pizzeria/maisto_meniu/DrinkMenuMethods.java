package lt.baltictalents.pizzeria.maisto_meniu;

import java.util.*;

public class DrinkMenuMethods extends DrinkMenu {
    //sitas kai returnina i maina
//    @Override
//    public String[] addDrinks(String dName) {
//        LinkedList<String> drinkList = new LinkedList<>();
//        String[] drinkArr = new String[drinkList.size()];
//
//        drinkList.toArray(drinkArr);
//        int drinkArrLength = drinkArr.length;
//        String[] newArr =  new String[drinkArrLength + 1];
//
//        System.arraycopy(drinkArr, 0, newArr, 0, drinkArrLength);
//        newArr[drinkArrLength] = dName;
//        System.out.println("newArr storina: " + Arrays.toString(newArr));
//        return newArr;
//    }

    @Override
    public Map<Double, String> addDrinkss(String dName, double dPrice) {

        TreeMap<Double, String> drinkChoice = new TreeMap<>();
        int count = 0; int position = 0;

        if(drinkChoice.size() == 0 || count == 0){
            System.out.println("Suveikia ifas");
            drinkChoice.put(dPrice, dName);
            position = 1;
            System.out.println("Dydis: " + drinkChoice.size());
        }
        else if(drinkChoice.size() > 0 || position > 1){

        }
//        else if(drinkChoice.size() != 0 || count > 0 && position > 1){
//            System.out.println("Suveikia else ifas");
//            Map.Entry<Double, String> lastEntryy = drinkChoice.lastEntry();

//            int drinkChoicePosition = new TreeMap<>(drinkChoice.values()).get(position);
//            drinkChoice.put(dPrice, dName);
//            System.out.println("lastentry  name: " + lastEntryy.getValue());
//            System.out.println("lastentry  price: " + lastEntryy.getKey());
//            System.out.println("Last entry: " + lastEntryy);
//            System.out.println("Drinking choice: " + drinkChoice);
            System.out.println("Dydis: " + drinkChoice.size());
//        }
        System.out.println("Result: " + drinkChoice);

        return drinkChoice;
    }
}
