package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
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
        String res = "";
        String[] mass = result.split(" ");
        if (result.contains("+"))
        {
            int val = Integer.parseInt(mass[0]) + Integer.parseInt(mass[2]);
            res = result + val;
        }
        else if (result.contains("-"))
        {
            int val = Integer.parseInt(mass[0]) - Integer.parseInt(mass[2]);
            res = result + val;
        }
        else if (result.contains("*"))
        {
            int val = Integer.parseInt(mass[0]) * Integer.parseInt(mass[2]);
            res = result + val;
        }
        System.out.println(res);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

