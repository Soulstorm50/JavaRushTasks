package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList arr = new ArrayList<>();
        try
        {
            while (true) {
                arr.add(Integer.parseInt(r.readLine()));
            }
        }
        catch (Exception e )
        {
            for (Object i : arr) {
                System.out.println(i);
            }
        }
    }
}
