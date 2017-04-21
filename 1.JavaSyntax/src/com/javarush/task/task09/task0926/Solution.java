package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> ls = new ArrayList<>();
        int[] first = {1, 2, 3, 4, 5};
        ls.add(first);
        int[] second = {11, 12};
        ls.add(second);
        int[] third = {31, 32, 33, 34};
        ls.add(third);
        int[] four = {41, 42, 43, 44, 45, 46, 47};
        ls.add(four);
        int[] fifth = new int[0];
        ls.add(fifth);
        return ls;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
