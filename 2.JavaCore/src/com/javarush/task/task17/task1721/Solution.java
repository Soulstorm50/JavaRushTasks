package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            reader.close();

            List<String> lines = Files.readAllLines(Paths.get(file1), StandardCharsets.UTF_8);
            for (String line : lines) {
                allLines.add(line);
            }

            List<String> lines2 = Files.readAllLines(Paths.get(file2), StandardCharsets.UTF_8);
            for (String line : lines2) {
                forRemoveLines.add(line);
            }
        } catch (IOException e) {}

        System.out.println(allLines);
        System.out.println();
        System.out.println(forRemoveLines);

        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            System.out.println("Exeption done!");
        }

        System.out.println(allLines);
        System.out.println();
        System.out.println(forRemoveLines);
    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines))
        {
            allLines.removeAll(forRemoveLines);
        }
        else
        {
            System.out.println("allLines clearing");
            allLines.clear();
            throw new CorruptedDataException();

        }
    }
}
