package com.Chapter10;

public class Main {

    public static void main(String[] args){

        Outer outer = new Outer();
        Outer.Inner i = outer.content();
    }
}
