package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Soul on 13.05.2017.
 */
public class Hippodrome {
    private List<Horse> horses = new ArrayList<>();

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    static Hippodrome game;

    public void run(){
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {ex.printStackTrace();}
        }
    }
    public void move(){
        for (int i = 0; i < getHorses().size(); i++) {
            getHorses().get(i).move();
        }
    }
    public void print(){
        for (int i = 0; i < getHorses().size(); i++) {
            getHorses().get(i).print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
    public Horse getWinner(){
        Horse winner = new Horse("Winner", 0, 0);
        for (int i = 0; i < horses.size(); i++) {
            if (horses.get(i).getDistance() > winner.getDistance())
                winner = horses.get(i);
        }
        return winner;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }


    public static void main(String[] args) {
        List<Horse> list = new ArrayList<>();
        list.add(new Horse("Flash", 3, 0));
        list.add(new Horse("Bat", 3, 0));
        list.add(new Horse("Rob", 3, 0));
        game = new Hippodrome(list);

        game.run();
        game.printWinner();
    }
}
