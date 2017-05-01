package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        BufferedReader myFileReader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = myFileReader.readLine()) != null)
        {
            String[] parts = line.split(" ");
            if (parts[0].equals(args[0]))
            {
                System.out.println(line);
                break;
            }
        }
        myFileReader.close();



    }
}
