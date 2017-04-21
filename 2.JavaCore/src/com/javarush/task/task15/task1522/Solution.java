package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем Singleton pattern
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        readKeyFromConsoleAndInitPlanet();
    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String s = reader.readLine();
            thePlanet = null;

            if (s.equals(Planet.SUN)) { thePlanet = Sun.getInstance();}
            else if (s.equals(Planet.MOON)) { thePlanet = Moon.getInstance();}
            else if (s.equals(Planet.EARTH)) { thePlanet = Earth.getInstance();}




    }
}
