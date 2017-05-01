package com.javarush.task.task18.task1816;

/*
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = args[0];
        int count = 0;
        FileInputStream inputStream = new FileInputStream(fileName);

        byte[] buffer = new byte[inputStream.available()];

        if (inputStream.available() > 0)
        {
            inputStream.read(buffer);
        }
        for (byte aBuffer : buffer) {
            if ((aBuffer > 64 && aBuffer < 91) || (aBuffer > 96 && aBuffer < 123))
                count++;
        }
        System.out.println(count);
        inputStream.close();





//        byte[] buffer = new byte[inputStream.available()];
//        while (inputStream.available() > 0)
//        {
//            inputStream.read(buffer);
//        }
//
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < buffer.length; i++) {
//            sb.append((char) buffer[i]);
//        }
//        String buf = sb.toString().toLowerCase();
//        char[] bufArr = buf.toCharArray();
//         int count = 0;
//
//        for (int i = 0; i < bufArr.length; i++) {
//            for (int j = 0; j < engAlf.length; j++) {
//                if (bufArr[i] == engAlf[j])
//                {
//                    count++;
//                }
//            }
//        }
//
//
//
//        System.out.println(count);
//        inputStream.close();

    }
}
