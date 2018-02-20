package danil.debug;

public class Debug {

    public int i;
    public int a;

   public int[] mas = {1, 2, 3};
   public String[] massive;


    public static void debug(){
        System.out.println("debug");
    }

    Debug(){
        this(10, 20);
    }

    Debug(int b, int y){
        this.a = b;
        this.i = y;
    }

    Debug(int r){
        this.i = r;
        this.a = r;
    }

    Debug(int lengch, String s){
        massive = new String[lengch];
        for (int o = 0; o < lengch; o++)
            massive[o] = s;
    }

}
