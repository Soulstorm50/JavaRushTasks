package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

import sun.security.jca.GetInstance;

import java.lang.instrument.Instrumentation;

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject<Object>();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    static class StringObject<Object> implements SimpleObject<String>
    {
       public SimpleObject<String> getInstance() {
            return this;
        }
    }

}
