package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int maximumByteInFile = 0;
        while (inputStream.available() > 0)
        {
            int data = inputStream.read();

            if (data > maximumByteInFile)
            {
                maximumByteInFile = data;
            }
        }
        System.out.println(maximumByteInFile);
        reader.close();
        inputStream.close();
    }
}
