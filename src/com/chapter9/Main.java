package com.chapter9;

import java.util.Scanner;

import static com.chapter9.Adventure.*;
import static com.chapter9.Music.tuneAll;
import static com.chapter9.Raising.*;

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

        Playable[] orchestra = {

                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };

        tuneAll(orchestra);

        Transformation t = new Transformation();
        t.transformation("может что-то да получится");

        Hero hero = new Hero();
        t(hero);
        u(hero);
        v(hero);
        w(hero);
        c(hero);

        SpeedCar speedCar = new SpeedCar();
        n(speedCar);
        k(speedCar);
        m(speedCar);
        j(speedCar);

        Scanner scanner = new Scanner(new Transformer(20));
        //System.out.println(scanner);
    }
}
