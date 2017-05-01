package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    private FileInputStream original;

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException{

        super(fileName);

        char[] filename = fileName.toCharArray();
        String resStr = "";
        for (int i = filename.length - 4; i < filename.length; i++) {
            resStr += filename[i];
        }
        if (resStr.equals(".txt"))
        {
            this.original = new FileInputStream(fileName);
        }
        else {
            super.close();
            throw new UnsupportedFileNameException();

        }

    }








    public static void main(String[] args) {

    }
}

