package Danil.chapter9;

public class Cycles {

    public static void cycles(CycleFactory factory){

        Cycle c = factory.getCycle();
        c.cycle();
       // c.cycles(factory);
    }
}
