package com.chapter9;

public abstract class Rodent{

    Rodent(){

        System.out.println("Rodent");
    }

    protected abstract void eat();

    protected abstract void coat();
}
