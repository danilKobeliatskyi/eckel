package com.chapter9;

public class TricycleFactory implements CycleFactory {

    public Cycle getCycle(){

        return new Tricycle();
    }
}
