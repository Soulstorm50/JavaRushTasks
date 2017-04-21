package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] chars = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++){
            list.add(chars[i]);
        }
        for (int i = 0; i < 40; i++){
            if (list.get(i) == ' '){
                for (int j = i+1; j < list.size(); j++){
                    System.out.print(list.get(j));
                }
            }
            else {
                for (int j = i; j < list.size(); j++){
                    System.out.print(list.get(j));
                }
            }
            System.out.println();
        }

    }

}

