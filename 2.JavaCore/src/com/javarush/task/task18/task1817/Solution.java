package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = args[0];

        int allChar = 0;
        int spaceChar = 0;

        FileInputStream inputStream = new FileInputStream(fileName);

        byte[] buffer = new byte[inputStream.available()];

        if (inputStream.available() > 0)
        {
            inputStream.read(buffer);
        }
        allChar = buffer.length;
        for (byte spaceBuffer : buffer ) {
            if (spaceBuffer == ' ') {spaceChar++;}
        }

        double res = ((double) spaceChar / (double) allChar) * 100;

        String pattern = "##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        System.out.println(decimalFormat.format(res));
        inputStream.close();

    }
}
