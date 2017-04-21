package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {

    public static void main(String[] args) throws IOException{
        // напишите тут ваш код
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));   // Создали файл(simple.txt)


        for(int i = 1000; i>0; i--){
            String s = reader.readLine();
            String dataWithNewLine = s + System.getProperty("line.separator");
            bw.write(dataWithNewLine);
            if (s.equals("exit"))
                break;
        }
        bw.close();


    }
}
