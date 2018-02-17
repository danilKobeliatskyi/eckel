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

        IntValue[] i3 = { new IntValue(1), new IntValue(2), new IntValue(3), new IntValue(4), new IntValue(5) };
        System.out.println(Arrays.toString(i3));
        Arrays.sort(i3);
        int index = Arrays.binarySearch(i3, new IntValue(3));
        System.out.println("Index: " + index + ", " + i3[index]);
    }
}
