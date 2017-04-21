package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Figel", 15000);
        map.put("Smirnoff", 5000);
        map.put("Ivanov", 250);
        map.put("Kalekin", 100);
        map.put("Verevkin", 130);
        map.put("Kirilov", 12000);
        map.put("Vanin", 750);
        map.put("Khryschev", 999999);
        map.put("Kharchenko", 50000);
        map.put("Terlenko", 8000);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            int value = pair.getValue();
            String key = pair.getKey();
            if(value < 500)
            {
                map.remove(key, value);
            }

        }
    }

    public static void main(String[] args) {

    }
}