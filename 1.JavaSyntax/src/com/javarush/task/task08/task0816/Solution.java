package com.javarush.task.task08.task0816;

import com.sun.prism.shader.DrawPgram_Color_AlphaTest_Loader;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JUNE 1 1980"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("MAY 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("JUNE 1 1980"));
        map.put("Stallone9", new Date("JUNE 1 1980"));
        map.put("Stallone10", new Date("JUNE 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        HashMap dates = new HashMap<>(map);
        Iterator iterator = dates.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next().toString();
            Date value = (Date) dates.get(key);
            int month = value.getMonth();
            if (month > 4 && month < 8){
                map.remove(key);
            }
        }

    }

    public static void main(String[] args) {

    }
}