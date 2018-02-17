package Danil.chapter16;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        BerylliumSphere[] bsa1 = new BerylliumSphere[3];
        for(int i = 0; i < bsa1.length; i++)
            bsa1[i] = new BerylliumSphere();
        System.out.println(Arrays.toString(bsa1));
        BerylliumSphere[] bsa2 = new BerylliumSphere[4];
        System.out.println(Arrays.toString(bsa2));
        System.arraycopy(bsa1, 0, bsa2, 0, bsa1.length);
        System.out.println(Arrays.toString(bsa2));
    }
}
