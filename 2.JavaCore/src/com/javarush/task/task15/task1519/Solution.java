package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean stroka;
        while (true) {
            String s = reader.readLine();
            if (s.equals("exit")) { break;}
            else {
                try {
                    if (s.contains(".")) { print((Double) Double.parseDouble(s));}
                    else { int in = Integer.parseInt(s);
                    if (in > 0 && in < 128) { print((short) in);}
                    else {print(in);}
                    }
                } catch (Exception e) {
                    print(s);
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
