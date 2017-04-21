package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1); set.add(2); set.add(3); set.add(4); set.add(5);
        set.add(6); set.add(7); set.add(8); set.add(9); set.add(10);
        set.add(11); set.add(12); set.add(13); set.add(14); set.add(15);
        set.add(16); set.add(17); set.add(18); set.add(19); set.add(20);
        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (int num : set)
        {
            if(num <= 10)
            {
                set2.add(num);
            }
        }
return set2;
    }

    public static void main(String[] args) {
removeAllNumbersMoreThan10(createSet());
    }
}
