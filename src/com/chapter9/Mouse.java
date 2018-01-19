package com.chapter9;

public class Mouse extends Rodent {

    Mouse(){

        System.out.println("Mouse");
    }

    protected void eat(){

        System.out.println("Mouse eats cheese");
    }


    protected void coat(){

        System.out.println("coat white or gray");
    }
}
