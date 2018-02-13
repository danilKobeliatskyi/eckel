package Danil.chapter8;

public class Percussion extends Instrument{
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
