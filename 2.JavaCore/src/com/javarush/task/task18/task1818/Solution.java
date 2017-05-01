package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Vvedite adres pervogo faila");
        String file1 = reader.readLine();
        System.out.println("Vvedite adres vtorogo faila");
        String file2 = reader.readLine();
        System.out.println("Vvedite adres tretego faila");
        String file3 = reader.readLine();
        FileOutputStream outputStream = new FileOutputStream(file1);
        SequenceInputStream sequenceInputStream = new SequenceInputStream(new FileInputStream(file2), new FileInputStream(file3));
        int data;
        while (true)
        {
            data = sequenceInputStream.read();
            if(data == -1)
                break;
            outputStream.write(data);
        }
        // up code work correctly
        sequenceInputStream.close();
        outputStream.close();
    }
}
