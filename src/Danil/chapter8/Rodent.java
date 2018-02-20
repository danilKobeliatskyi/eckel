package danil.chapter8;

public class Rodent{

    private Characteristic characteristic;
    private static long counter = 0;
    private final long id = counter++;

    Rodent(Characteristic characteristic){
        System.out.println("Rodent" + id);
        this.characteristic = characteristic ;
        this.characteristic.addRef();
    }

    protected void eat() {
        System.out.println("Rodent eat");
    }

    protected void dispose(){
    System.out.println("coat different");
    characteristic.dispose();
    }
}