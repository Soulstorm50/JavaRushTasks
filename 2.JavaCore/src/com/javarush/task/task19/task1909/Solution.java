package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader reader2 = new BufferedReader(new FileReader(file1));
        BufferedWriter writer2 = new BufferedWriter(new FileWriter(file2));

        while (reader2.ready()) {
            String line = reader2.readLine().replace(".", "!");
            writer2.write(line);
        }

        reader2.close();
        writer2.close();

    }
}
