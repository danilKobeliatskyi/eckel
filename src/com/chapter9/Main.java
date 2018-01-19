package com.chapter9;

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

        Document document = new Document();
        document.print();

        Table.from();
    }
}
