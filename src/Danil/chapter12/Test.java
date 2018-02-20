package danil.chapter12;

public class Test {
    public static void f() throws Exception1 {
        System.out.println("f()");
        throw new Exception1("Ouch from f()");
    }
}
