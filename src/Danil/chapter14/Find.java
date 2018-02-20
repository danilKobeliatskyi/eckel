package danil.chapter14;

import java.lang.reflect.*;

public class Find {
    public static void main(String[] args) throws Exception {
        Interf i = MakeSecret.makeSecret();
        System.out.println("a is of class type: " + i.getClass().getName());
        for(Method m : i.getClass().getDeclaredMethods()) {
            m.setAccessible(true);
            m.invoke(i);
        }
    }
}
