package lt.baltictalents.pizzeria;

import lt.baltictalents.pizzeria.pizzeria_menus.MenuChoices;

import java.io.*;

import static lt.baltictalents.pizzeria.pizzeria_menus.MenuChoices.mainMenuChoices;
//august 20 - padariau kad galetum jumpint i maina po kiekvieno pasirinkimo,
//pašalinau warningus ir typos,
//pakeiciau Arrays.asList i Collections.singletonList(), paaiskinimas apacioj rasi kazkur.
//kazkas nepatinka keisk ,tik buk gerutis pakomentuok naujienas, daug laiko prireike kad susigaudyt kur kas
//del masyvu tai dar nesugalvojau kaip padaryt, ryt galesim pagalvot draugiskai

public class PizzeriaMain{

    public static void main(String[] args) throws IOException {

        MenuChoices.mainMeniuMeniu();
        mainMenuChoices();
    }
}
