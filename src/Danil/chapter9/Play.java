package danil.chapter9;

public class Play {

    public static void fall(TrowFactory factory){
        Throw t = factory.getTrow();
        while (t.drop());
    }
}
