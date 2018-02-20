package danil.chapter8;

public class Instrument {
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
