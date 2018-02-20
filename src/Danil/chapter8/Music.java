package danil.chapter8;

import java.util.Random;

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