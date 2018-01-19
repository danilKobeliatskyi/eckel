package com.chapter9;

import static com.chapter9.Music.tuneAll;

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

        Book book = new Book();
        book.open();
        book.number(234);
        book.close();

        Sandwich sandwich = new Sandwich();
        sandwich.name();

        Instrument[] orchestra = {

                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };

        tuneAll(orchestra);
    }
}
