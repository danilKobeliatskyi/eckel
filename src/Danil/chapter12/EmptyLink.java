package danil.chapter12;

public class EmptyLink {
    private static Integer i = null;
    public EmptyLink() {
        try {
            System.out.println(i.toString());
        } catch(NullPointerException e) {
            System.err.println("Caught NullPointerException");
            e.printStackTrace();
        }
        try {
            i = 10;
            System.out.println(i.toString());
        } catch(NullPointerException e) {
            System.err.println("Caught NullPointerException");
            e.printStackTrace();
        } finally {
            System.out.println("Got through it");
        }
    }
}
