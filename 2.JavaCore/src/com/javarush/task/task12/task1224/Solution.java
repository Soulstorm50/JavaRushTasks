package com.javarush.task.task12.task1224;

/* 
Что это? «Кот», «Тигр», «Лев», «Бык», «хз»
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        String x = "";
        if (o instanceof Cat) {x = "Кот"; }
        else if (o instanceof Tiger) {x = "Тигр";}
        else if (o instanceof Lion) {x = "Лев";}
        else if (o instanceof Bull) {x = "Бык";}
        else {x = "хз";}

        return x;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
