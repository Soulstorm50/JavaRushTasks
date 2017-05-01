package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        if (inputStream.available() > 0)
        {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            for (int i = 0; i < buffer.length; i++) {
                outputStream.write(buffer[buffer.length - 1 - i]);
            }
        }

        reader.close();
        inputStream.close();
        outputStream.close();

    }
}
