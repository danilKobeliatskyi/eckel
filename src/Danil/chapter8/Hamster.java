package danil.chapter8;

public class Hamster extends Rodent{

    private Characteristic characteristic;
    private static long counter = 0;
    private final long id = counter++;

    Hamster(Characteristic characteristic){
        super(characteristic);
        System.out.println("Hamster" + id);
        this.characteristic = characteristic;
        this.characteristic.addRef();
    }

    protected void eat() {
        System.out.println("Hamster eat");
    }

    protected void dispose(){
    System.out.println("coat grey ot brown");
    characteristic.dispose();
    super.dispose();
    }
}