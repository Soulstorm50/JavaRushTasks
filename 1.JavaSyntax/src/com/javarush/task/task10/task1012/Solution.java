package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        ArrayList<Character> vseBukvi = new ArrayList<Character>();
        for (int i = 0; i < list.size(); i++) {
            char[] temp = list.get(i).toCharArray();
            for (int j = 0; j < temp.length; j++) {
                vseBukvi.add(temp[j]);
            }

        }
        List<Integer> bukviCount = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < alphabet.size(); i++) {
            for (Character bukva : vseBukvi) {
                if (bukva.equals(alphabet.get(i))) {
                    count++;
                }
            }
            bukviCount.add(count);
            count = 0;
        }

        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + bukviCount.get(i));
        }



        //Решение с использованием Map. Выводит на экран результат НЕ в алфавитном порядке
//        ArrayList<Character> vseBukvi = new ArrayList<Character>();
//        for (int i = 0; i < list.size(); i++) {
//            char[] temp = list.get(i).toCharArray();
//            for (int j = 0; j < temp.length; j++) {
//                vseBukvi.add(temp[j]);
//            }
//
//        }
//        Map<Character, Integer> map = new HashMap<Character, Integer>();
//        int count = 0;
//
//        for (int i = 0; i < alphabet.size(); i++) {
//            for (Character bukva : vseBukvi) {
//                if (bukva.equals(alphabet.get(i))) {
//                    count++;
//                }
//            }
//            map.put(alphabet.get(i), count);
//            count = 0;
//        }
//
//        for (Map.Entry<Character, Integer> pair : map.entrySet())
//        {
//            String key = pair.getKey().toString();                      //ключ
//            String value = pair.getValue().toString();                  //значение
//            System.out.println(key + " " + value);
//        }
    }
}