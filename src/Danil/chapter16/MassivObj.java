package danil.chapter16;
import java.util.*;

public class MassivObj {
    BerylliumSphere[] a;
    public static void test(BerylliumSphere[] a) {
        System.out.println(Arrays.asList(a));
    }
    public static <T> void test(T[] t) {
        System.out.println(Arrays.asList(t));
    }
    public static void test(int[] ia) {
        System.out.println(Arrays.toString(ia));
    }

    public static void main(String[] args) {
        System.out.println("Objects:");
        test(new BerylliumSphere[3]);
        test(new BerylliumSphere[]{
                new BerylliumSphere(), new BerylliumSphere() });
        BerylliumSphere[] a = { new BerylliumSphere(),
                new BerylliumSphere(), new BerylliumSphere() };
        test(a);
        BerylliumSphere[] bsa = new BerylliumSphere[2];
        test(bsa);
        bsa = a;
        test(bsa);

        System.out.println("Primitives:");
        test(new int[]{ new Integer(0), new Integer(0) });
        test(new int[2]);
        int[] ia = { 1, 2, 3, };
        test(ia);
    }
}
