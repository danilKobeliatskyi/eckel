package Danil.chapter16;
import java.util.*;
public class IntValue {
    protected int x;

    IntValue(int x) {
        this.x = x;
    }

    IntValue(){
    }

    public boolean equals(Object b) {
        return (b.getClass().getSimpleName() == "A" && this.x == ((IntValue)b).x) ? true : false;
    }

    public void equals(Object[] i1, Object[] i2){
        if (i1.equals(i2))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
