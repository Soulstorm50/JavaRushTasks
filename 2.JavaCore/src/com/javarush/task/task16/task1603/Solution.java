package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут

        SpecialThread tr1 = new SpecialThread();
        SpecialThread tr2 = new SpecialThread();
        SpecialThread tr3 = new SpecialThread();
        SpecialThread tr4 = new SpecialThread();
        SpecialThread tr5 = new SpecialThread();
        Thread childThread1 = new Thread(tr1);
        Thread childThread2 = new Thread(tr2);
        Thread childThread3 = new Thread(tr3);
        Thread childThread4 = new Thread(tr4);
        Thread childThread5 = new Thread(tr5);
        list.add(childThread1);
        list.add(childThread2);
        list.add(childThread3);
        list.add(childThread4);
        list.add(childThread5);



    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
