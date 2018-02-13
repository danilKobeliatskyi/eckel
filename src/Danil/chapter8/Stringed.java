package Danil.chapter8;

public class Stringed extends Instrument {
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
