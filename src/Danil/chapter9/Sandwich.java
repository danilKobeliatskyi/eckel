package danil.chapter9;

public class Sandwich extends PortableLunch {

    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();

    public void name(){

        b.name();
        c.name();
        l.name();
        p.name();
        System.out.println("Sandwich");
    }
}
