package Danil.chapter16;
import java.util.*;

public class IntArgument {
    public static BerylliumSphere[] someSpheres(int n) {
        BerylliumSphere[] result = new BerylliumSphere[n];
        for(int i = 0; i < n; i++)
            result[i] = new BerylliumSphere();
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.asList(someSpheres(7)));
    }
}
