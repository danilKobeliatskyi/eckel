package danil.chapter10;

public class A {
    U u(){
        return new U() {
            @Override
            public void name() {
                System.out.print("\nInterface U");
            }

            @Override
            public void print() {
                System.out.print(" in");
            }

            @Override
            public void where() {
                System.out.print(" Class A");
            }
        };
    }
}
