package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Petr");
        map.put("Sidorov", "Sidr");
        map.put("Semenov", "Semen");
        map.put("Figel", "Oleksandr");
        map.put("Ivanova", "Ivanka");
        map.put("Petrova", "Petrovka");
        map.put("Sidorova", "Marinka");
        map.put("Semenova", "Skarlet");
        map.put("Makedonsky", "Oleksandr");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
            if(value == name)
            {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
            if(key == lastName)
            {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {


    }
}
