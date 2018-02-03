package Danil.chapter11;

public class FailingConstructor {
    private Integer[] integers = new Integer[2];
    private static Disposable d0;
    private static Disposable d1;
    FailingConstructor() throws Exception {
        try {
            d0 = new Disposable();
            try {
                integers[2] = 2;
                try {
                    d1 = new Disposable();
                } catch(Exception e) {
                    System.out.println("Caught e in inner try loop");
                    e.printStackTrace(System.err);
                    System.out.println("Failed to create d1");
                }
            } catch(Exception e) {
                System.out.println("Caught e in middle try loop");
                e.printStackTrace(System.err);
                System.out.println("Disposing d0");
                d0.dispose();
            }
        } catch(Exception e) {
            System.out.println("Caught e in outer try loop");
            e.printStackTrace(System.err);
            System.out.println("Failed to create d0");
        }
    }
    FailingConstructor failingConstructor = null;
    public static void main(String[] args) {
        try {
            FailingConstructor failingConstructor = new FailingConstructor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
