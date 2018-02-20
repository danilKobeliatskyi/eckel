package danil.chapter7;

class Component7{
    Component7(){
        System.out.println("Constructor Component7");
    }
    void dispose(){System.out.println("End component7");}
}

class Component8{
    Component8(){
        System.out.println("Constructor Component8");
    }
    void dispose(){System.out.println("End component8");}
}

class Component9{
    Component9(){
        System.out.println("Constructor Component9");
    }
    void dispose(){System.out.println("End component9");}
}

class RootDispose{
    RootDispose() {
        System.out.println("Constructor RootDispose");
        Component7 c7 = new Component7();
        c7.dispose();
        Component8 c8 = new Component8();
        c8.dispose();
        Component9 c9 = new Component9();
        c9.dispose();
    }
}

public class StemDispose extends RootDispose {
    StemDispose() {
        System.out.println("Constructor StemDispose");
        Component7 com7 = new Component7();
        com7.dispose();
        Component8 com8 = new Component8();
        com8.dispose();
        Component9 com9 = new Component9();
        com9.dispose();
    }
}

