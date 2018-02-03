package Danil.chapter12;

public class TreatmentException1 {
    public static void f() throws Exception1 {
        System.out.println("f()");
        throw new Exception1("Ouch from f()");
    }

    public TreatmentException1() {
        try {
            f();
        } catch (Exception1 e) {
            System.err.println("Caught TreatmentException1");
            e.printStackTrace();
            e.showS();
        }
    }
}