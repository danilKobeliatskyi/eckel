package Danil.chapter12;

public class Information {
    static void f() throws ClassException1, ClassException2{
        throw new ClassException1();
    }
    static void g() throws ClassException2 {
        throw new ClassException2();
    }
    public Information() {
        try {
            f();
        } catch(Exception ClassException1) {} catch (ClassException2 classException2) {
            classException2.printStackTrace();
        } catch (ClassException1 classException1) {
            classException1.printStackTrace();
        }
        try {
            g();
        } catch(Exception ClassException2) {} catch (ClassException2 classException2) {
            classException2.printStackTrace();
        }
    }
}
