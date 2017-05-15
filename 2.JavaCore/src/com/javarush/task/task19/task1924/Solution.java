package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(br.readLine()));
        br.close();

        while (reader.ready()) {
            String line = reader.readLine();
            String[] words = line.split(" ");
            String afterLine = "";
            for (int i = 0; i < words.length; i++) {
                if (isNum(words[i]) && map.containsKey(Integer.parseInt(words[i]))) {afterLine += (map.get(Integer.parseInt(words[i]))) + " ";}
                else { afterLine = afterLine + words[i] + " "; }
            }

            System.out.println(afterLine.trim());
        }
        reader.close();
    }
        public static boolean isNum(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
