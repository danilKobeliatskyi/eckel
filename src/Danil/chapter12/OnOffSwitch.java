package danil.chapter12;

public class OnOffSwitch {
    private static Switch sw = new Switch();
    static Integer[] x = new Integer[1];
    public static void f(int i) throws OnOffException1, OnOffException2 {}
    public OnOffSwitch() {
        try {
            sw.on();
            f(x[0]);
            sw.off();
        } catch(OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch(OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}
