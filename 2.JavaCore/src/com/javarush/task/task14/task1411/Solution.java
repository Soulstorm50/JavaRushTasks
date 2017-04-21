package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        while (true)
        {
            //создаем объект, пункт 2
            key = reader.readLine();

                if (key.equals("user")) { person = new Person.User();}
                else if (key.equals("loser")) { person = new Person.Loser();}
                else if (key.equals("coder")) { person = new Person.Coder();}
                else if (key.equals("proger")) { person = new Person.Proger();}
                else if (!key.equals("user") || !key.equals("loser") || !key.equals("coder") || !key.equals("proger"))
            { break;}


            doWork(person); //вызываем doWork

        }

    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User)
        {
            Person.User x = (Person.User) person;
            x.live();
        }
        else if (person instanceof Person.Loser)
        {
            Person.Loser x = (Person.Loser) person;
            x.doNothing();
        }
        else if (person instanceof Person.Coder)
        {
            Person.Coder x = (Person.Coder) person;
            x.coding();
        }
        else if (person instanceof Person.Proger)
        {
            Person.Proger x = (Person.Proger) person;
            x.enjoy();
        }

    }
}
