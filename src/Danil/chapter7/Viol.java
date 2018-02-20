package danil.chapter7;

class Instrument{

    protected static boolean strings(boolean f){
        if (f == true)
            System.out.println("This is a stringed instrument");
        else System.out.println("Not a stringed instrument");
        return f;
    }
}



public class Viol extends Instrument {

    static void viol() {
        Instrument.strings(true);
    }
}
