package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args)throws IOException {
        String file = args[0];
//        String file = "D:/2.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while (reader.ready()) {
            String line = reader.readLine();

            String name = line.replaceAll("[0-9]", "").trim();
            Date date = new Date();
            String[] words = line.split(" ");
//            int[] ddmmyyyy = new int[2];
            List<Integer> listInt = new ArrayList<>();

            for (int i = 0; i < words.length; i++) {
                if (isNum(words[i])) {listInt.add(Integer.parseInt(words[i]));}
            }
            GregorianCalendar calendar = new GregorianCalendar(listInt.get(2), (listInt.get(1) - 1), listInt.get(0));
            date = calendar.getTime();

            PEOPLE.add(new Person(name, date));
        }
        reader.close();

//        for (int i = 0; i < PEOPLE.size(); i++) {
//            System.out.println(PEOPLE.get(i).getName() + " " + PEOPLE.get(i).getBirthday());
//        }

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
