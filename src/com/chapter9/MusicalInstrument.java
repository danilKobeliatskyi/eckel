package com.chapter9;

public abstract class MusicalInstrument implements Instrument {

    public void play(Note n){
        System.out.println(this + ".play " + n);
    }
    public void adjust(){
        System.out.println(this + ".adjust");
    }
}
