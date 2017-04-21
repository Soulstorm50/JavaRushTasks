package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        URL aURL = new URL(str);
        str = aURL.getQuery();


        String[] parts = str.split("&");

        String result = "";

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < parts.length; i++) {

            String[] temp = parts[i].split("=");
            result += temp[0] + " ";
            if (temp[0].equals("obj"))
            { list.add(temp[1]);}


        }
        System.out.println(result);

        for (int i = 0; i < list.size(); i++) {
            try {
                alert(Double.parseDouble(list.get(i)));
            } catch (NumberFormatException e) {
                alert(list.get(i));
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
