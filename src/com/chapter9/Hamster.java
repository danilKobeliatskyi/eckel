package com.chapter9;

public class Hamster extends Rodent {

    Hamster(){

        System.out.println("Hamster");
    }

    protected void eat(){

        System.out.println("Hamster eats corn");
    }


    protected void coat(){

        System.out.println("coat gray or brown");
    }
}
