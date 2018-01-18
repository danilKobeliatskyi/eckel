package com.chapter8;

public class Main {

    public static void main(String[] args){

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
            shp.word();}

        Music music = new Music();
        System.out.println(Wind.what());
        Instrument[] orchestra = new Instrument[9];
        for (int j = 0; j < orchestra.length; j++) {
            orchestra[j] = music.next();
        }

            music.tuneAll(orchestra);

        Cage cage = new Cage();
        Rodent[] r = new Rodent[9];
        for (int k = 0; k < orchestra.length; k++)
            r[k] = cage.next();
        for (Rodent rodent : r) {
            rodent.what();
            rodent.dispose();
        }

        Footbol f = new Footbol();
        f.players(22);

        Sandwich sandwich = new Sandwich();
    }
}
