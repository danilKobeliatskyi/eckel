package Danil.chapter8;

public class Guitar extends Stringed {
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
