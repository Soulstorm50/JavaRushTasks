package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Oleksandr");
        map.put("Sidorov", "Oleksandr");
        map.put("Semenov", "Semen");
        map.put("Figel", "Oleksandr");
        map.put("Ivanova", "Ivanka");
        map.put("Petrova", "Petrovka");
        map.put("Sidorova", "Marinka");
        map.put("Semenova", "Skarlet");
        map.put("Makedonsky", "Oleksandr");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            String value = pair.getValue();
            String key = pair.getKey();
            map.remove(key, value);
            int size = map.size();
            removeItemFromMapByValue(map, value);
            if (map.size() == size) map.put(key, value);

        }



    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
