package com.chapter8;

public class Rat extends Rodent{

    private Characteristic characteristic;
    private static long counter = 0;
    private final long id = counter++;

    Rat(Characteristic characteristic){

        super(characteristic);
        System.out.println("Rat" + id);
        this.characteristic = characteristic;
        this.characteristic.addRef();
    }


    protected void dispose(){

    System.out.println("coat gray");
    characteristic.dispose();
//  super.dispose();
    }
}