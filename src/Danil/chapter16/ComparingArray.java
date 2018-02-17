package Danil.chapter16;

import java.util.Arrays;

public class ComparingArray {
    public static void main(String[] args) {
        IntValue[] i1 = { new IntValue(1), new IntValue(2), new IntValue(3) };
        IntValue[] i2 = { new IntValue(1), new IntValue(2), new IntValue(3) };

        IntValue intValue = new IntValue();
        intValue.equals(i1, i2);

        System.out.println(Arrays.toString(i1));
        System.out.println(Arrays.toString(i2));
        System.out.println(Arrays.equals(i1, i2));
    }
}
