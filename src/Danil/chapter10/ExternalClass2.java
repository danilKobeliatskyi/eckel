package danil.chapter10;

public class ExternalClass2 {
    private InterfaceForInnerClass content(){
        return new InterfaceForInnerClass() {
            @Override
            public void description() {
                System.out.println("Anonymous class");
            }

        };
    }
        ExternalClass2(){
            final InterfaceForInnerClass content = content();
            content.description();
        }
}
