package com.javarush.task.task19.task1906;

/* 
Четные байты
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("    Vvedite adres pervogo faila:");
        FileReader fileReader = new FileReader(reader.readLine());
        System.out.println("    Vvedite adres vtorogo faila:");
        FileWriter fileWriter = new FileWriter(reader.readLine());


        int count = 1;
        while (fileReader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = fileReader.read();
            if ((count % 2) == 0) {
                fileWriter.write(data);
            }
            count++;
        }

        //закрываем потоки после использования
        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
