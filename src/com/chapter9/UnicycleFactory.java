package com.chapter9;

public class UnicycleFactory implements CycleFactory {

    public Cycle getCycle(){

        return new Unicycle();
    }
}
