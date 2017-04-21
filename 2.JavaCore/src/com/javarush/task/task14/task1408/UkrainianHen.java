package com.javarush.task.task14.task1408;

/**
 * Created by Soul on 01.04.2017.
 */
public class UkrainianHen extends Hen implements Country{
    String UKRAINE = "Ukraine";
    int getCountOfEggsPerMonth() { return 45;}
    String getDescription() {
        return super.getDescription() + " Моя страна - " + UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
