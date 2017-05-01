package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите адрес первого файла:");
        String file1 = reader.readLine();
        System.out.println("Введите адрес второго файла:");
        String file2 = reader.readLine();
        System.out.println("Введите адрес третьего файла:");
        String file3 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(file1);

        FileOutputStream outputStream1 = new FileOutputStream(file2);

        FileOutputStream outputStream2 = new FileOutputStream(file3);


        if (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);

            int tmp = count - (count / 2);
            outputStream1.write(buffer, 0, (count -(count / 2)));

            outputStream2.write(buffer, tmp, count - tmp);
        }


        reader.close();
        inputStream.close();
        outputStream1.close();
        outputStream2.close();



    }
}
