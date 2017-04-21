package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String glass = "";
        String soglass = "";
        for (int i = 0; i <str.length() ; i++) {
            if (isVowel(str.charAt(i)) && str.charAt(i) != ' ')
            {
                glass = glass + str.charAt(i) + " ";
            }
            else if (str.charAt(i) != ' ')
            {
                soglass = soglass + str.charAt(i) + " ";
            }
            else
            {
                continue;
            }
        }
        System.out.println(glass);
        System.out.println(soglass);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}