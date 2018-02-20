package danil.chapter12;

public class Exception1 extends Exception {
    private String msg;

    Exception1(String msg) {
        super(msg);
        System.out.println("Exception1()");
        this.msg = msg;
    }

    protected void showS() {
        System.out.println("Message from Exception1: " + msg);
    }
}
