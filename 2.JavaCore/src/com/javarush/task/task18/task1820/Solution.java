package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Vvedite adres pervogo faila");
        String file1 = reader.readLine();
        System.out.println("Vvedite adres vtorogo faila");
        String file2 = reader.readLine();
        FileInputStream brf1 = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        byte[] buffer = new byte[brf1.available()];
        brf1.read(buffer);
        brf1.close();

        String[] numbers = new String(buffer).split(" ");
        String line = "";
        for (String s : numbers){
            line += Math.round(Double.parseDouble(s)) + " ";
        }

        outputStream.write(line.trim().getBytes());
        outputStream.close();








    }
}
