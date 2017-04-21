package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> mapCats = new HashMap<String, Cat>();
        Cat cat1 = new Cat("Tom");
        Cat cat2 = new Cat("Boris");
        Cat cat3 = new Cat("Murzik");
        Cat cat4 = new Cat("Kisa");
        Cat cat5 = new Cat("Ruby");
        Cat cat6 = new Cat("Proma");
        Cat cat7 = new Cat("Rama");
        Cat cat8 = new Cat("Piston");
        Cat cat9 = new Cat("Pushok");
        Cat cat10 = new Cat("Murka");
        mapCats.put(cat1.name, cat1);
        mapCats.put(cat2.name, cat2);
        mapCats.put(cat3.name, cat3);
        mapCats.put(cat4.name, cat4);
        mapCats.put(cat5.name, cat5);
        mapCats.put(cat6.name, cat6);
        mapCats.put(cat7.name, cat7);
        mapCats.put(cat8.name, cat8);
        mapCats.put(cat9.name, cat9);
        mapCats.put(cat10.name, cat10);
        return mapCats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            set.add(pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
