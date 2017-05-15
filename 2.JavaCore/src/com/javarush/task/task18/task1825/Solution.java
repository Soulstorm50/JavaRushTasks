package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/



import java.io.*;
import java.util.*;

public class Solution {
//    public static List<String> filenamesList = new ArrayList<>();
//    public static String fileFolder = "D:/Lion/";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        ArrayList<String> list = new ArrayList<>();
        while (!s.equals("end")) {
            list.add(s);
            s = reader.readLine();
        }
        Collections.sort(list);

        String mainFileName = list.get(0).substring(0, list.get(0).lastIndexOf(".part"));
        FileOutputStream outputStream = new FileOutputStream(mainFileName);
        for (String fileName: list) {
            FileInputStream inputStream = new FileInputStream(fileName);
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            inputStream.close();
            outputStream.write(buffer);
        }
        outputStream.close();




        // Мое решение (говнокод конечно, но свое)

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String filename;
//        while (true) {
//            filename = reader.readLine();
//            if (filename.equals("end")) {
//                reader.close();
//                break;
//            }
//            filenamesList.add(filename);
//        }
//
//        listSort(filenamesList);
//
//
//        FileOutputStream fileOutputStream = new FileOutputStream(fileFolder + getFileMainName(filenamesList), true);
//
//
//        for (int i = 0; i < filenamesList.size(); i++) {
//            FileInputStream fileInputStream = new FileInputStream(fileFolder + filenamesList.get(i));
//            byte[] buffer = new byte[fileInputStream.available()];
//            fileInputStream.read(buffer);
//            fileOutputStream.write(buffer);
//            fileInputStream.close();
//        }
//        fileOutputStream.close();


    }





//    public static void  listSort (List<String> list) {
//        Collections.sort(list, new Comparator<String>() {
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//    }
//
//
//        public static String getFileMainName (List<String> list) {
//            String str = list.get(0);
//            List<String> ls = new ArrayList<>();
//            StringTokenizer st = new StringTokenizer(str, ".");
//            String res = "";
//            while (st.hasMoreTokens()){
//                ls.add(st.nextToken());
//            }
//            for (int i = 0; i < ls.size() - 1; i++) {
//                res = res +"." + ls.get(i);
//            }
//            return res.replaceFirst(".", "");
//    }
 }
