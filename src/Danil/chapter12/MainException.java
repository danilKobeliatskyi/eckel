package danil.chapter12;

import java.io.FileInputStream;

public class MainException {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("null.jv");
        file.close();
    }
}
