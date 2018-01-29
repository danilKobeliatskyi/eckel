package com.chapter8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Rize d = new Rize();
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        d.rize(u);
        d.rize(b);
        d.rize(t);

        RandomShapeGenerator gen = new RandomShapeGenerator();
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
        for (Shape shp : s) {
            shp.draw();
            shp.ears();
            shp.word();
        }

        Music music = new Music();
        System.out.println(Wind.what());
        Instrument[] orchestra = new Instrument[9];
        for (int j = 0; j < orchestra.length; j++) {
            orchestra[j] = music.next();
        }

        music.tuneAll(orchestra);

        Characteristic characteristic = new Characteristic();
        RodentGenerator rodentGenerator = new RodentGenerator();
        List<Rodent> rodentList = new ArrayList<Rodent>();
        for(int i = 0; i < 10; i++)
            rodentList.add(rodentGenerator.next());
        Iterator<Rodent> iterator = rodentList.iterator();
        while(iterator.hasNext()) {
            Rodent rodent = iterator.next();
            System.out.println(rodent + ": ");
            rodent.eat();
            rodent.dispose();
        }

        Footbol f = new Footbol();
        f.players(22);

        Sandwich sandwich = new Sandwich();

        Shared shared = new Shared();
        Composing[] composing = {

                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared)
        };
        for (Composing c : composing)
            c.dispose();

        RectangularGlyph rectangularGlyph = new RectangularGlyph(5);

        AlertStatus alertStatus = new AlertStatus();
        alertStatus.status();
        alertStatus.alertLow();
        alertStatus.status();
        alertStatus.alertMiddle();
        alertStatus.status();
        alertStatus.alertHigh();
        alertStatus.status();

        Cycle[] cycles = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };
        /*for (Cycle c : cycles){
            //c.balance();
            }*/
        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
    }
}

