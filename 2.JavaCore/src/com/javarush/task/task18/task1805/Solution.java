package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream (reader.readLine());
        SortedSet<Integer> set = new TreeSet<>();

        while (inputStream.available() > 0) {
            set.add(inputStream.read());

        }

        for (Integer current : set) {
            System.out.print(current + " ");
        }



        reader.close();
        inputStream.close();
    }
}
