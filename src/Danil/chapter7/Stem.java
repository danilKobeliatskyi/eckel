package Danil.chapter7;

class Component1{
    Component1(){
        System.out.println("Constructor Component1");
    }
}

class Component2{
    Component2(){
        System.out.println("Constructor Component2");
    }
}

class Component3{
    Component3(){
        System.out.println("Constructor Component3");
    }
}

class Root{
    Root() {
        Component1 c1 = new Component1();
        Component2 c2 = new Component2();
        Component3 c3 = new Component3();
        System.out.println("Constructor Root");
    }
}

public class Stem extends Root {
    Stem() {
        Component1 com1 = new Component1();
        Component2 com2 = new Component2();
        Component3 com3 = new Component3();
        System.out.println("Constructor Stem");
    }
}
