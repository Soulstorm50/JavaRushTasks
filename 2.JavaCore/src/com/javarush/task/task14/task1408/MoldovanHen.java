package com.javarush.task.task14.task1408;

/**
 * Created by Soul on 01.04.2017.
 */
public class MoldovanHen extends Hen implements Country{
    String MOLDOVA = "Moldova";
    int getCountOfEggsPerMonth() { return 15;}
    String getDescription() {
        return super.getDescription() + " Моя страна - " + MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
