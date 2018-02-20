package danil.chapter16;

public class TMassiv<T> {
    @SuppressWarnings("unchecked")
    T[] a = (T[])new Object[2];
    public static void main(String[] args) {
        String[] sa = new String[2];
        // sa[0] = new Integer(0); error: incompatible types
        Object[] oa = new Object[3];
        oa[0] = new String("hi");
        oa[1] = new A();
        int x = 2;
        oa[2] = x;
        System.out.println("oa[2]: " + oa[2].getClass());
        oa = sa;
        System.out.println("oa: " + oa.getClass());
    }
}
