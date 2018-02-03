package Danil.chapter7;

class BaseClass {
    boolean a;
    BaseClass(boolean f){
        a =f;
        System.out.println("Base class");
    }
}

public class DerivedClass extends BaseClass {
    DerivedClass(boolean f){
        super(true);
        this.a = f;
        System.out.println("Constructor with arg");
    }
    DerivedClass(){
        super(true);
        System.out.println("Constructor without args");
    }
}
