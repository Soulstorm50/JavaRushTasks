package com.javarush.task.task22.task2210;

import java.lang.reflect.Array;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {

        String[] res = getTokens("level22.lesson13.task01", ".");
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    public static String [] getTokens(String query, String delimiter) {

        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] res = new String[stringTokenizer.countTokens()];
        int count = 0;
        while (stringTokenizer.hasMoreTokens())
        {
            String token = stringTokenizer.nextToken();
            res[count] = token;
            count++;
        }


        return res;
    }
}
