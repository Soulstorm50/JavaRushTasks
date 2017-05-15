package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    private static final long serialVersionUID = 1;
    public static String fileName;
    transient private FileOutputStream stream;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution("D:/111.txt");
        solution.writeObject("lala");
//        solution.close();
        FileOutputStream fos = new FileOutputStream("D:/222.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
        objectOutputStream.writeObject(solution);
//        objectOutputStream.close();
//        fos.close();
        FileInputStream fis = new FileInputStream("D:/222.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fis);
        Solution solution2 = (Solution) objectInputStream.readObject();
//        fis.close();
        solution2.writeObject("haha");
//        solution2.close();
    }
}
