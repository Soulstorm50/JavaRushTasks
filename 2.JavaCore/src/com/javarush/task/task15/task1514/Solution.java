package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
        labels.put(1.2, "some text1");
        labels.put(2.2, "some text2");
        labels.put(3.2, "some text3");
        labels.put(4.2, "some text4");
        labels.put(5.2, "some text5");
    }



    public static void main(String[] args) {System.out.println(labels);
    }
}
