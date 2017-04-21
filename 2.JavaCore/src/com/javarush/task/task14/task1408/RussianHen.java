package com.javarush.task.task14.task1408;

/**
 * Created by Soul on 01.04.2017.
 */
public class RussianHen extends Hen implements Country {
    String RUSSIA = "Russia";
    int getCountOfEggsPerMonth() { return 29;}
    String getDescription() {
        return super.getDescription() + " Моя страна - " + RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
