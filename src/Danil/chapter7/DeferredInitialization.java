package danil.chapter7;

class ImplementationOfDeferredInitialization {
     public static String s;
}

public class DeferredInitialization{
    public static String  implementationOfDeferredInitialization(){
        ImplementationOfDeferredInitialization d = new ImplementationOfDeferredInitialization();
        if (d.s == null)
            d.s = "initialized";
        else d.s = d.s;
        System.out.println(d.s);
        return "s=" + d.s;
    }
}
