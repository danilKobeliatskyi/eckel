package danil.chapter16;

public class Banana {
    private static long counter;
    private final long id = counter++;
    public String toString() {
        return "Banana " + id;
    }
}
