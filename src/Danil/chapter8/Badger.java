package danil.chapter8;

public class Badger extends Rodent{

    private Characteristic characteristic;
    private static long counter = 0;
    private final long id = counter++;

    Badger(Characteristic characteristic){
        super(characteristic);
        System.out.println("Badger" + id);
        this.characteristic = characteristic;
        this.characteristic.addRef();
    }

    protected void eat() {
        System.out.println("Badger eat");
    }

    protected void dispose(){
    System.out.println("coat black and white");
    characteristic.dispose();
    super.dispose();
    }
}
