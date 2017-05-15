package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());

        StringBuilder sb = new StringBuilder();
        while (fileReader.ready()) {
            sb.append((char) fileReader.read());
        }

        int count = 0;
        String[] str = sb.toString().toLowerCase().split("\\s*(\\s|,|!|\\.)\\s*");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("world"))
            {count++;}
        }
        System.out.println(count);


        reader.close();
        fileReader.close();
    }
}
