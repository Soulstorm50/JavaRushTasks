package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Самые частые байты
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

        int max = 0;
        for(Map.Entry entry: hashmap.entrySet()) {
            if ((int) entry.getValue() > max) max = (int) entry.getValue();
        }

        for (Map.Entry entry: hashmap.entrySet()) {
            if(entry.getValue().equals(max)) System.out.print(entry.getKey() + " ");
        }
        reader.close();
        inputStream.close();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        FileInputStream inputStream = new FileInputStream(reader.readLine());
//
//        List<Integer> listOfBytes = new ArrayList<>();
//        List<Integer> testList = new ArrayList<>();
//        List<Integer> resultList = new ArrayList<>();
//        while (inputStream.available() > 0)
//        {
//            listOfBytes.add(inputStream.read());
//        }
//
//        for (int i = 0; i < listOfBytes.size(); i++) {
//            for (int j = 0; j < listOfBytes.size(); j++) {
//                if (listOfBytes.get(i).equals(listOfBytes.get(j)) )
//                {
//                    testList.add(listOfBytes.get(i));
//
//                }
//            }
//
//            if (testList.size() > resultList.size())
//            {
//                resultList.clear();
//                resultList.addAll(testList);
//            }
//            testList.clear();
//
//        }
//        for (Integer aResultList : resultList) {
//            System.out.print(aResultList + " ");
//        }
//
//        reader.close();
//        inputStream.close();
    }
}
