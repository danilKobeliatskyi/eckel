package com.chapter9;

public class Dice implements Throw {

    private int drops = 0;
    private static final int DROPS = 2;

    public boolean drop(){
        System.out.println("Dice drop " + drops);
        return ++drops != DROPS;
    }
}
