package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = null;
        while (true)
        {
            filename = reader.readLine();
            if (filename.equals("exit"))
                break;
            new ReadThread(filename).start();

        }
        reader.close();

        System.out.println(resultMap);



    }

    public static class ReadThread extends Thread {
        String file;
        public ReadThread(String fileName) {
            //implement constructor body
            this.file = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        public void run() {
            try {
            FileInputStream inputStream = new FileInputStream(file);

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

            int mostKey = 0;
            Integer mostKeyVal = 0;


            Iterator<Map.Entry<Byte, Integer>> iterator = map.entrySet().iterator();

            while (iterator.hasNext())
            {
                //получение «пары» элементов
                Map.Entry<Byte, Integer> pair = iterator.next();
                byte key = pair.getKey();            //ключ
                Integer value = pair.getValue();        //значение
                if (value > mostKeyVal)
                {
                    mostKeyVal = value;
                    mostKey = key;
                }

            }
            inputStream.close();
            resultMap.put(file, mostKey);
            } catch (IOException e ) {}
        }
    }
}
