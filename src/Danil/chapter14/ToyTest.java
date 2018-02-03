package Danil.chapter14;

public class ToyTest {
    static void printInfo(Class cc){
        System.out.println("Name of class: " + cc.getName() + " is the interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("Danil.chapter14.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can not found FancyToy");
            System.exit(1);
        }printInfo(c);
        for (Class face : c.getInterfaces())
            System.out.println(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        }catch (InstantiationException e){
            System.out.println("Can not create exemplar");
            System.exit(1);
        }catch (IllegalAccessException e){
            System.out.println("Access denied");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
