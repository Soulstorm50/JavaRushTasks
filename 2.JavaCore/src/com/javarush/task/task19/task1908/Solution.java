package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fn1 = reader.readLine();
        String fn2 = reader.readLine();
        reader.close();
        BufferedReader file1 = new BufferedReader(new FileReader(fn1));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(fn2));


        String strFile1= "";
        while (file1.ready()){
            strFile1 =strFile1 + file1.readLine();
        }

        String[] splFile1 = strFile1.split(" ");


        for (String s: splFile1){
            if(isNum(s)){
                file2.write(s + " ");
            }
        }

        file1.close();
        file2.close();

    }

    public static boolean isNum(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
