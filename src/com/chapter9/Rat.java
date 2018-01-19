package com.chapter9;

public class Rat extends Rodent {

    Rat(){

        System.out.println("Rat");
    }

    protected void eat(){

        System.out.println("Rat eats everything");
    }


    protected void coat(){

        System.out.println("coat gray");
    }
}
