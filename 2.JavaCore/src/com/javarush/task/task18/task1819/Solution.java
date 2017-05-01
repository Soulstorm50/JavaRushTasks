package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Vvedite adres pervogo faila");
        String file1 = reader.readLine();
        System.out.println("Vvedite adres vtorogo faila");
        String file2 = reader.readLine();

        FileInputStream inputStream1 = new FileInputStream(file1);

        // записывает байты из файла 1 в массив байтов
        byte[] bufferFile1 = new byte[inputStream1.available()];
        inputStream1.read(bufferFile1);
        inputStream1.close();

        inputStream1.close();





        FileOutputStream outputStream = new FileOutputStream(file1);
        FileInputStream inputStream2 = new FileInputStream(file2);

        while (inputStream2.available() > 0)
        {
            int data = inputStream2.read();
            outputStream.write(data);
        }

        outputStream.close();
        inputStream2.close();


        FileWriter fw = new FileWriter(file1, true);
        InputStream is = new ByteArrayInputStream(bufferFile1);

        while (is.available() > 0)
        {
            int data = is.read();
            fw.write(data);
        }

        fw.close();
        is.close();
















    }
}
