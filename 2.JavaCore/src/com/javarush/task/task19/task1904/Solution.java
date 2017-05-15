package com.javarush.task.task19.task1904;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {

//        Scanner sc = new Scanner(new FileInputStream("D:/1.txt"), "windows-1251");
//
//
//        String str = sc.nextLine();
//
//            String[] s = sc.nextLine().split(" ");
//        System.out.println(s[0]);
//        Date date = new Date();
//        date.setYear(2000);
//        date.setMonth(1);
//        date.setDate(10);
//
//        System.out.println(date);




    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;


        PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }


        @Override
        public Person read() throws IOException {
            if (fileScanner.hasNext()) {
                String[] inputArray = fileScanner.nextLine().split(" ");
                Date birthDate = (new GregorianCalendar(Integer.parseInt(inputArray[5]),Integer.parseInt(inputArray[4]) - 1, Integer.parseInt(inputArray[3]))).getTime();
                return new Person(inputArray[1],inputArray[2],inputArray[0],birthDate);
            }
            return null;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
