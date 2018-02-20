package danil.chapter19;

import java.util.Random;

public enum  CartoonCharacter {SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
    private static Random rand = new Random();

    public static CartoonCharacter next() {
        return values()[rand.nextInt(values().length)];
    }
}
