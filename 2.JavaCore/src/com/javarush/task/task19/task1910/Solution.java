package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        BufferedWriter writer1 = new BufferedWriter(new FileWriter(file2));

        while (reader1.ready()) {
            writer1.write(reader1.readLine().replaceAll("\\W", ""));
        }

        reader1.close();
        writer1.close();
    }
}
