package danil.chapter19;

import java.util.Random;

public class Enums<T extends Enums> {
    private static Random rand = new Random(47);
    public static <T extends Enums<T>> T random(Class<T> ec){
        return random(ec.getEnumConstants());
    }
    public static <T> T random(T[] values){
        return values[rand.nextInt(values.length)];
    }
}
