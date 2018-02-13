package Danil.chapter16;

import java.util.Arrays;

public class TwoIntArguments {
    public static BerylliumSphere[][] sphereAM(int size1, int size2) {
        BerylliumSphere[][] result = new BerylliumSphere[size1][size2];
        for(int i = 0; i < size1; i++) {
            result[i] = new BerylliumSphere[size2];
            for(int j = 0; j < size2; j++)
                result[i][j] = new BerylliumSphere();
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(sphereAM(2,2)));
        System.out.println(Arrays.deepToString(sphereAM(4,3)));
    }
}
