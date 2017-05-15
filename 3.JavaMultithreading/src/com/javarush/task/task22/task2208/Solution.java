package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> test = new LinkedHashMap<>();
        test.put("name","Ivanov");
        test.put("country", "Ukraine");
        test.put("city", "Kiev");
        test.put("age", null);
        System.out.println(getQuery(test));

    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet())
        {
            if (entry.getValue() != null) {
                if (sb.toString().equals(""))
                    sb.append(String.format("%s = \'%s\'", entry.getKey(), entry.getValue()));
                 else
                    sb.append(String.format(" and %s = \'%s\'", entry.getKey(), entry.getValue()));
            }
        }
        return sb.toString();
    }
}
