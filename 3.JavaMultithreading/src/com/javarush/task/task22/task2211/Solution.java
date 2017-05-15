package com.javarush.task.task22.task2211;

import java.io.*;

/* 
Смена кодировки
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
//        String file1 = "D:/1.txt";
//        String file2 = "D:/2.txt";

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        while (reader.ready()) {
            String line = reader.readLine();
            byte[] buffer = line.getBytes("Windows-1251");
            writer.write(new String(buffer, "UTF-8"));
        }
        reader.close();
        writer.close();
    }
}
