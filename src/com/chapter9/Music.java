package com.chapter9;

public class Music {

    static void tune(Instrument i){

        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e){

        for (Instrument i : e)
            tune(i);
    }
}
