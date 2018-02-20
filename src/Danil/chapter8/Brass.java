package danil.chapter8;

public class Brass extends Wind {
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }
    public String toString() {
        return "Brass";
    }
    void adjust() {
        System.out.println("Adjusting Brass");
    }
    void clearSpitValve() {
        System.out.println("Brass clearing spit valve");
    }
}
