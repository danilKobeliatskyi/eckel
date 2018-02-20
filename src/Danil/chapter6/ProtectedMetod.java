package danil.chapter6;

public class ProtectedMetod {
    protected String protectedMetod(){
        System.out.println("Protected metod");
        return null;
    }
}

class TestProtectedMetod extends ProtectedMetod {
    protected void testprotectedMetod() {
        String s = protectedMetod();
    }
}

