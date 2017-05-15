package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader(
                args[0]
                //"C:\\jr\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1925\\let.txt"
        ));
        BufferedWriter fw = new BufferedWriter(new FileWriter(args[1]));
        String fileInput = " ";
        String fileOutput = "";
        while (fr.ready()) fileInput+=fr.readLine()+" ";
        fr.close();

        Pattern pattern = Pattern.compile("(?<=\\s)[.[^ ]]{7,}(?=\\s)");
        Matcher matcher = pattern.matcher(fileInput);


        while (matcher.find()){
            fileOutput += fileInput.substring(matcher.start(), matcher.end())+" ";
        }

        fileOutput = fileOutput.trim().replaceAll(" ", ",");
        fw.write(fileOutput);
        // System.out.println(fileOutput);
        fw.close();



//        String file1 = args[0];
//        String file2 = args[1];
////        String file1 = "D:/f1.txt";
////        String file2 = "D:/f2.txt";
//
//        BufferedReader reader = new BufferedReader(new FileReader(file1));
//        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
//
//        while (reader.ready()) {
//            String[] words = reader.readLine().split(" ");
//            String res = "";
//            for (String str : words) {
//                if(str.toCharArray().length > 6) res += str + " ";
//            }
//
//
//            writer.write(res.trim().replaceAll(" ", ","));
//        }
//        reader.close();
//        writer.close();
    }
}
