package com.chapter9;

public class DiceFactory implements TrowFactory {

    public Throw getTrow(){

        return new Dice();
    }
}
