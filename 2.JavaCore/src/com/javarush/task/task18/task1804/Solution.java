package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream (reader.readLine());
        Map<Integer, Integer> hashmap = new HashMap<>();

        while (inputStream.available() > 0) {
            int d = inputStream.read();
            if(hashmap.containsKey(d)) {
                hashmap.put(d,hashmap.get(d) + 1);
            } else hashmap.put(d, 1);
        }

        int min = Integer.MAX_VALUE;
        for(Map.Entry entry: hashmap.entrySet()) {
            if ((int) entry.getValue() < min) min = (int) entry.getValue();
        }

        for (Map.Entry entry: hashmap.entrySet()) {
            if(entry.getValue().equals(min)) System.out.print(entry.getKey() + " ");
        }

        reader.close();
        inputStream.close();
    }
}
