package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename;
        while (true) {
            filename = reader.readLine();

            try {

                FileInputStream inputStream = new FileInputStream(filename);
                inputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println(filename);
                break;
            }

        }
    }
}
