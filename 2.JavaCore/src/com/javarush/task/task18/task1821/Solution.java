package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);

        SortedMap<Byte, Integer> map = new TreeMap<>();

        while (inputStream.available() > 0)
        {
            int data = inputStream.read();
            if (map.containsKey((byte)data))
            {
                map.replace((byte)data, (map.get((byte)data)+1));
            }
            else {
                map.put((byte)data, 1);
            }
        }



        Iterator<Map.Entry<Byte, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<Byte, Integer> pair = iterator.next();
            byte key = pair.getKey();            //ключ
            char ch = (char)key;
            Integer value = pair.getValue();        //значение
            System.out.println( ch + " " + value);
        }
        inputStream.close();
    }
}
