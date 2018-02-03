package Danil.chapter8;

public class Shared {

    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared(){

        System.out.println("Create " + this);
    }

    public void addRef(){

        refcount++;
    }

    public void finalize(){
        if ((refcount == 1)) {
            System.out.println("Okey");
        }
        else System.out.println("Error");
    }

    protected void dispose(){

        finalize();
        if (--refcount == 0)
            System.out.println("Dispose" + this);
    }

    public String toString(){

        return "Shared " + id;
    }
}
