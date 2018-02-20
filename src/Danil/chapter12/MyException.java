package danil.chapter12;

public class MyException extends RuntimeException {
    public MyException(String msg) {
        super(msg);
        System.out.println("MyException(String msg)");
    }
}
