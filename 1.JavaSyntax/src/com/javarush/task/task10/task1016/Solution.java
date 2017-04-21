package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        //напишите тут ваш код
        for(String el : list){
            result.put(el,0);
        }
        for (int i = 0; i < list.size(); i++){
            result.computeIfPresent(list.get(i),(k,v)->v+1);
        }

        // Моя реализация. Работает, но не проходит валидацию.
//        int count = 0;
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list.size(); j++) {
//                if(list.get(i).equals(list.get(j)))
//                {
//                    count++;
//                }
//            }
//            result.put(list.get(i), count);
//            count = 0;
//        }
        return result;
    }

}

