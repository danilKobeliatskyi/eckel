package danil.chapter14;

import java.lang.reflect.*;

public class ToyTest {
    public static void main(String[] args) {
        // get appropriate constructor and create new instance:
        try {
            Toy.class.getDeclaredConstructor(int.class).newInstance(1);
            // catch four exceptions:
        } catch (NoSuchMethodException e) {
            System.out.println("No such method: " + e);
        } catch (InstantiationException e) {
            System.out.println("Unable make Toy: " + e);
        } catch (IllegalAccessException e) {
            System.out.println("Unable access: " + e);
        } catch (InvocationTargetException e) {
            System.out.println("Target invocation problem: " + e);
        }
    }
}
