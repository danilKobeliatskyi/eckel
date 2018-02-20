package danil.chapter10;

public class ExternalClass {

    public InterfaceForInnerClass contents(){
        return new InterfaceForInnerClass() {
            @Override
            public void description() {
                System.out.println("Anonymous class");
            }
        };
    }
}
