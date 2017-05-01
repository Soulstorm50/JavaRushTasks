package com.javarush.task.task18.task1813;

import java.io.*;
import java.nio.channels.FileChannel;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {



    public static String fileName = "C:/tmp/result.txt";

    private FileOutputStream origin;

    public AmigoOutputStream (FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(fileName);
        this.origin = fileOutputStream;
    }




    @Override
    public void write(int b) throws IOException {
        origin.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        origin.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        origin.write(b, off, len);
    }

    @Override
    public FileChannel getChannel() {
        return super.getChannel();
    }

    @Override
    protected void finalize() throws IOException {
        super.finalize();
    }

    @Override
    public void flush() throws IOException {
        origin.flush();
    }



    @Override
    public void close() throws IOException {
        origin.flush();
        StringBuilder sb = new StringBuilder();
        sb.append("JavaRush © All rights reserved.");
        String data = sb.toString();
        origin.write(data.getBytes());
        origin.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
