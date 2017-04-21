package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private String status;
        private boolean sex;
        private String hobbie;
        private boolean driverLicence;

       public Human(int age, boolean sex)
        {
            this.age = age;
            this.sex = sex;
        }
        public Human(String name)
        {
            this.name = name;
        }
        public Human(String name, int age, String status, boolean sex, String hobbie, boolean driverLicence)
        {
            this.name = name;
            this.age = age;
            this.status = status;
            this.sex = sex;
            this.hobbie = hobbie;
            this.driverLicence = driverLicence;
        }
        public Human(String name, int age, boolean driverLicence)
        {
            this.name = name;
            this.age = age;
            this.driverLicence = driverLicence;
        }
        public Human(boolean sex, String hobbie)
        {
            this.sex = sex;
            this.hobbie = hobbie;
        }
        public Human(String name, String status, boolean sex)
        {
            this.name = name;
            this.status = status;
            this.sex = sex;
        }
        public Human(String name, boolean sex)
        {
            this.name = name;
            this.sex = sex;
        }
        public Human(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        public Human(String name, String hobbie)
        {
            this.name = name;
            this.hobbie = hobbie;
        }
        public Human(String name, int age, boolean sex, String status)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.status = status;
        }

    }
}
