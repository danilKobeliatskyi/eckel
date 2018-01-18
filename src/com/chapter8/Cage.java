package com.chapter8;

import java.util.Random;

class Characteristic{

    private String s;

    Characteristic(String s){

        this.s = s;
        System.out.println("Create characteristic " + s);
    }

    protected void dispose(){

        System.out.println("Finish characteristic " + s);
    }
}

class Description{

    private String s;

    Description(String s){

        this.s = s;
        System.out.println("Create Description " + s);
    }

    protected void dispose(){

        System.out.println("Finish Description " + s);
    }
}

class Rodent{

    Characteristic p = new Characteristic("Rodent eats");

    static String what(){

        return "Rodent";
    }

        Description t = new Description("different");

    protected void dispose(){
        t.dispose();
        p.dispose();
    }
}

class Mouse extends Rodent{

    Characteristic p = new Characteristic("Mouse eats cheese");

    static String what(){

        return "Mouse";
    }

        Description t = new Description("White or grey");

    protected void dispose(){
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Hamster extends Rodent{

    Characteristic p = new Characteristic("Hamster eats corn");

    static String what(){

        return "Hamster";
    }

    Description t = new Description("Grey ot brown");

    protected void dispose(){
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Rat extends Rodent{

    Characteristic p = new Characteristic("Rat eats everything");

    static String what(){

        return "Rat";
    }

    Description t = new Description("Gray");

    protected void dispose(){
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Badger extends Rodent{

    Characteristic p = new Characteristic("Badger eats meats");


    static String what(){

        return "Badger";
    }

    Description t = new Description("black and white");

    protected void dispose(){
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

public class Cage {

    private Random rand =new Random(6);

    public Rodent next(){

        switch (rand.nextInt(16)){
            default:
            case 0: return new Mouse();
            case 1: return new Hamster();
            case 3: return new Rat();
            case 4: return new Badger();
        }
    }
}
