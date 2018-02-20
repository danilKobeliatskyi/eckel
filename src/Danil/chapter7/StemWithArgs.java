package danil.chapter7;

class Component4{
    Component4(int component){
        System.out.println("Constructor Component" + component );
    }
}

class Component5{
    Component5(int component){
        System.out.println("Constructor Component" + component);
    }
}

class Component6{
    Component6(int component){
        System.out.println("Constructor Component" + component);
    }
}

class Roots{
    Roots(int component) {
        Component4 c4 = new Component4(4);
        Component5 c5 = new Component5(5);
        Component6 c6 = new Component6(6);
        System.out.println("Constructor Roots of " + component + " components");
    }
}

public class StemWithArgs extends Roots {
    StemWithArgs(int component) {
        super(3);
        Component4 com4 = new Component4(4);
        Component5 com5 = new Component5(5);
        Component6 com6 = new Component6(6);
        System.out.println("Constructor StemWithArgs of "  + component + " components");
    }
}

