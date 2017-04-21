package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arr = new ArrayList[2];
        for (int i = 0; i < arr.length; i++) {
            ArrayList<String> list = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                String text = "text" + j;
                list.add(text);
            }
            arr[i] = list;
        }
        return arr;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}