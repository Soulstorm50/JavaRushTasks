package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];
//        String file1 = "D:/f1.txt";
//        String file2 = "D:/f2.txt";

        BufferedReader reader = new BufferedReader(new FileReader(file1));
//        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
        FileWriter writer = new FileWriter(file2);

        while (reader.ready()) {
            String[] words = reader.readLine().split(" ");
            for (String q : words) {
                try {
                    Pattern p = Pattern.compile("[\\d]");
                    Matcher m = p.matcher(q);
                    if (m.find())
                        Integer.parseInt(q);
                } catch (NumberFormatException e) {
                    writer.write(q.trim() + " ");
                }
//                if (isNum(q.replaceAll("[a-zA-Z]", "")))
//                {
//                    writer.write(q + " ");
//                }
            }
        }
        reader.close();
        writer.close();
    }

//    public static boolean isNum(String str) {
//        try {
//            Integer.parseInt(str);
//            return true;
//        } catch (NumberFormatException e) {
//            return false;
//        }
//    }
}
