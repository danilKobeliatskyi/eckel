package danil.chapter16;

import java.util.ArrayList;
import java.util.List;

public class PeelBanana {
    public static void main(String[] args) {
        List<Peel<Banana>> peels = new ArrayList<Peel<Banana>>();
        for (int i = 0; i < 10; i++)
            peels.add(new Peel<Banana>(new Banana()));
        System.out.println(peels);
        System.out.println("peels.get(0).getClass(): " + peels.get(0).getClass());
    }
}