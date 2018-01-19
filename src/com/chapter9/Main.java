package com.chapter9;

import com.chapter8.AbstractClass;

public class Main {

    public static void main(String[] args){

        Rodent[] rodents = {
                new Mouse(),
                new Rat(),
                new Hamster(),
                new Badger()
        };
        for (Rodent r : rodents) {
            r.eat();
            r.coat();
        }

       //AbstractClass abstractClass = new AbstractClass() {};
    }
}
