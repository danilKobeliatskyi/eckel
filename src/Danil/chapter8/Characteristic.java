package danil.chapter8;

public class Characteristic{

    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Characteristic(){

        System.out.println("Create characteristic " + this);
    }

    public void addRef(){

        refcount++;
    }

    protected void dispose(){

            System.out.println("Dispose" + this);
    }

    public String toString(){

        return "Characteristic " + id;
    }
}
