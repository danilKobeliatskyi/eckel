package com.chapter9;

public class Play {

    public static void fall(TrowFactory factory){

        Throw t = factory.getTrow();
        t.drop();
        // c.cycles(factory);
    }
}
