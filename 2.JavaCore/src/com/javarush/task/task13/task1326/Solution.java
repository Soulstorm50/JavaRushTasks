package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException{
        // напишите тут ваш код


        ArrayList<Integer> list = new ArrayList<Integer>();
        String file;
        int line = 0;
        BufferedReader redfilename = new BufferedReader(new InputStreamReader(System.in));

        file = redfilename.readLine(); //записываем имя файла D:/123.txt

        BufferedReader readfile = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        while (readfile.ready()) {
            try {
                line = Integer.parseInt(readfile.readLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                continue;
            }
            if ((line % 2) == 0) {
                list.add(line);
            }
        }
        Collections.sort(list);
        for (int i : list) {
            System.out.println(i);
        }
        readfile.close();







//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        InputStream input = new FileInputStream(reader.readLine());
//
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        while (input.available() > 0)
//        {
//            char data = (char)input.read(); //читаем один байт из потока для чтения
//            String dataWithNewLine = data + System.getProperty("line.separator");
//            System.out.println(dataWithNewLine);
//            Integer x = Character.getNumericValue(data);
//            list.add(x);
//            System.out.println(x);
//        }
//        for (int i = 0; i < list.size(); i++) {
//            if ((list.get(i) % 2) == 0 )
//            {list2.add(list.get(i));}
//        }
//        System.out.println(list2);
//        Collections.sort(list2);
//        System.out.println(list2);
//        for (int i = 0; i < list2.size(); i++) {
//            System.out.println(list2.get(i));
//        }
//        input.close(); //закрываем потоки
    }
}
