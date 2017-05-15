package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        //запоминаем настоящий PrintStream в специальную переменную
        PrintStream consolePrint = System.out;

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();

        //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString();

        //Возвращаем все как было
        System.setOut(consolePrint);

        //Преобразовываем текст в заглавные буквы и выводим ее в консоль
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        reader.close();
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        for (int i = 0; i < result.toCharArray().length; i++) {
            fileOutputStream.write(result.toCharArray()[i]);
        }
        System.out.println(result);
        fileOutputStream.close();



    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

