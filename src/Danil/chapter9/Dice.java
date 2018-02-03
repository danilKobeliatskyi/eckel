package Danil.chapter9;

public class Dice implements Throw {
    private Dice() {
    }

    private int drops = 0;
    private static final int DROPS = 6;

    public boolean drop() {
        System.out.println("Dice drop " + drops);
        return ++drops != DROPS;
    }

    public static TrowFactory factory = new TrowFactory() {
        @Override
        public Throw getTrow() {
            return new Dice();
        }
    };
}
