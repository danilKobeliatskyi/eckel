package Danil.chapter8;

public class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }
    public String toString() {
        return "Woodwind";
    }
    void adjust() {
        System.out.println("Adjusting Woodwind");
    }
    void clearSpitValve() {
        System.out.println("Woodwind clearing spit valve");
    }
}
