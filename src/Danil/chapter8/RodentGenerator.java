package Danil.chapter8;

import java.util.Random;

public class RodentGenerator {
    Characteristic characteristic = new Characteristic();
    private Random rand = new Random();
    public Rodent next() {
        switch(rand.nextInt(3)) {
            default:
                case 0: return new Rodent(characteristic);
                case 1: return new Mouse(characteristic);
                case 2: return new Rat(characteristic);
                case 3: return new Hamster(characteristic);
                case 4: return new Badger(characteristic);
        }
    }
}
