package Danil.chapter7;

class Final{

    private final void f(){
        System.out.println("final metod f()");
    }
}

public class PrivatFinal extends Final{

    public void privat(){
        Final f = new Final();
        //f.f();
    }
}


final class FinalPrivat{

    public void f(){
        System.out.println("final metod f()");
    }
}

//class Private extends FinalPrivat{}
