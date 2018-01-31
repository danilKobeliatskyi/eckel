package com.chapter12;

public class StormyInning extends Inning implements Storm {
    public StormyInning() {}
    public StormyInning(String s) {}
    public void walk() {}
    public void event() {}
    public void rainHard() {}
    public void atBat() {}
    public static void main(String[] args) {
        StormyInning stormyInning = new StormyInning();
        stormyInning.atBat();
        Inning i = new StormyInning();
        i.atBat();
    }
}
