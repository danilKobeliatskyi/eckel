package danil.chapter14;

public class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        System.out.println();
        consumer(new SimpleProxy(new RealObject()));
        System.out.println();
        consumer(new SimpleProxy(new RealObject()));
        System.out.println();
        consumer(new SimpleProxy(new RealObject()));
    }
}
