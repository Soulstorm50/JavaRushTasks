package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import javafx.collections.transformation.SortedList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file = args[0];
//        String file = "D:/3.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        SortedMap<String, Double> resMap = new TreeMap<>();

        while (reader.ready()){
            String line = reader.readLine();
            if (resMap.containsKey(line.split(" ")[0]))
            {
                resMap.replace((line.split(" ")[0]), (Double.parseDouble(line.split(" ")[1]) + resMap.get(line.split(" ")[0]) ));
            }
            else
            {
                resMap.put(line.split(" ")[0], Double.parseDouble(line.split(" ")[1]));
            }
        }
        reader.close();

        double d = Double.MIN_VALUE;
        for (Map.Entry entry : resMap.entrySet()) {
            if ((double)entry.getValue() > d) { d = (double)entry.getValue();}

//            System.out.println(entry.getKey() + " "
//                    + entry.getValue());
        }
        for (Map.Entry entry : resMap.entrySet()) {
            if ((double)entry.getValue() == d) {
                System.out.println(entry.getKey());
            }

        }
    }
}
