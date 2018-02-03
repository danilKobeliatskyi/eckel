package Danil.chapter8;

import java.util.Random;

enum Note{

    MIDDLE_C, C_SHARP, B_FLAT;

}

class Instrument{

    void play(Note n){

        System.out.println("Instrument.play() " + n);
    }

    static String what(){

        return "Instrument";
    }

    void adjust(){

        System.out.println("Adjusting instrument");
    }
}

class Wind extends Instrument{

    void play(Note n){

        System.out.println("Wind.play() " + n);
    }

    static String what(){

        return "Wind";
    }

    void adjust(){

        System.out.println("Adjusting wind");
    }
}

class Percussion extends Instrument{

    void play(Note n){

        System.out.println("Percussion.play() " + n);
    }

    static String what(){

        return "Percussion";
    }

    void adjust(){

        System.out.println("Adjusting percussion");
    }
}

class Stringed extends Instrument{

    void play(Note n){

        System.out.println("Stringed.play() " + n);
    }

    static String what(){

        return "Stringed";
    }

    void adjust(){

        System.out.println("Adjusting stringed");
    }
}

class Brass extends Wind{

    void play(Note n){

        System.out.println("Brass.play() " + n);
    }

    static String what(){

        return "Brass";
    }

    void adjust(){

        System.out.println("Adjusting brass");
    }
}

class Woodwind extends Wind{

    void play(Note n){

        System.out.println("Woodwind.play() " + n);
    }

    static String what(){

        return "Woodwind";
    }

    void adjust(){

        System.out.println("Adjusting woodwind");
    }
}

class Guitar extends Stringed{

    void play(Note n){

        System.out.println("Guitar.play() " + n);
    }

    static String what(){

        return "Guitar";
    }

    void adjust(){

        System.out.println("Adjusting guitar");
    }
}

public class Music {

    public static void tune(Instrument i) {

        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {

        for (Instrument i : e)
            tune(i);
    }

    private Random rand = new Random(6);

    public Instrument next() {

        switch (rand.nextInt(16)) {
            default:
            case 1:
                return new Wind();
            case 0:
                return new Brass();
            case 3:
                return new Woodwind();
            case 4:
                return new Stringed();
            case 5:
                return new Percussion();
            case 6:
                return new Guitar();
        }
    }
}