package danil.chapter12;

public class CatchExceptionType {
    private static Integer[] x = new Integer[1];
    public static void f(int x) throws ExceptionTypeA, ExceptionTypeB, ExceptionTypeC {
        if(x < 0) throw new ExceptionTypeA("x < 0");
        if(x == 0) throw new ExceptionTypeB("x == 0");
        if(x > 0) throw new ExceptionTypeC("x > 0");
    }
    public CatchExceptionType() {
        try {
            f(x[0]);
            f(0);
            f(1);
            f(-1);
        } catch(Exception e) {
            System.out.println("Caught Exception");
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Finally: do something");
        }
    }
}
