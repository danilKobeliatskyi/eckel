package Danil.chapter5;

import java.util.Arrays;

public class Massivs {
    public static void massivs(String[] args) {
        Arguments.massive(new String[]{"one", "too", "three"});
    }
}

class Arguments {
    public static void massive(String[] args) {
        for (String s : args)
            System.out.println(s + " ");
    }
}

class MassiveWhithConstructor {
    static String s1;
    static String s2;
    static String s3;

    MassiveWhithConstructor() {
        s1 = new String("1");
        s2 = new String("2");
        s3 = new String("3");
        System.out.println(s1 + s2 + s3);
    }

    public static void massive(String[] args) {
        Integer[] a = new Integer[]{new Integer(s1), new Integer(s2), new Integer(s3)};
        System.out.println(Arrays.toString(a));
    }
}
