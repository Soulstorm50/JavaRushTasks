package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

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

        for (Map.Entry entry : resMap.entrySet()) {
            System.out.println(entry.getKey() + " "
                    + entry.getValue());
        }

    }
}
