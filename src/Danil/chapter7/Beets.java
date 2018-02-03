package Danil.chapter7;

class Insect {

    private int i = 9;

    protected int j;

    Insect(){
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");
    static int printInit(String s){
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insect {

    private int k = printInit("static Beetle.k initialized");

    public Beetle(){

        System.out.println("k = " + k + ", j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");
}

public class Beets extends Beetle{

    private int g = printInit("static Beets.g initialized");

    public Beets(){

        System.out.println("g = " + g + ", j = " + j);
    }

    private static int x3 = printInit("static Beets.x3 initialized");
}
