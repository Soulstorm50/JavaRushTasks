package com.javarush.task.task14.task1408;

/**
 * Created by Soul on 01.04.2017.
 */
public class BelarusianHen extends Hen implements Country{
    String BELARUS = "Belarus";
    int getCountOfEggsPerMonth() { return 30;}
    String getDescription() {
        return super.getDescription() + " Моя страна - " + BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
