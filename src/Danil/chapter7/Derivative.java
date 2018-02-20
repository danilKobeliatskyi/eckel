package danil.chapter7;

class Art{
    Art(){
        System.out.println("Constructor Art");
    }
}

class Drawling extends Art{
    Drawling(){
        System.out.println("Constructor Drawling");
    }
}

class Cartoon extends Drawling{
    Cartoon(){
        System.out.println("Constructor Cartoon");
    }
}

class A{
    A(boolean b){
        System.out.println("Constructor A");
    }
}

class B{
    String s;
    B(boolean f){
        s = "Constructor B";
    }
}

public class Derivative extends A{
    Derivative(){
        super(true);
        B b = new B(true);
        System.out.println(b.s);
    }
}

class Program {
    Program(int i){
        System.out.println("Constructor Program");
    }
}

class ComputerProgram extends Program{
    ComputerProgram(int i){
        super(i);
        System.out.println("Constructor ComputerProgram");
    }
}

class IntellijIdea extends ComputerProgram{
    IntellijIdea(){
        super(100);
        System.out.println("Constructor IntellijIdea");
    }
}