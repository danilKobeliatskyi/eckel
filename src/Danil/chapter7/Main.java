package danil.chapter7;

public class Main {
    public static void main(String[] args){
    DeferredInitialization.implementationOfDeferredInitialization();

    Inheritor.main(args);

    Cartoon cartoon = new Cartoon();

    Derivative d = new Derivative();

    IntellijIdea i = new IntellijIdea();

    DerivedClass derivedClass = new DerivedClass();

    Stem stem = new Stem();

    StemWithArgs stemWithArgs = new StemWithArgs(3);

    DetergentDelegation delegation = new DetergentDelegation("Detergent");
    System.out.println(delegation.s);

    StemDispose dispose = new StemDispose();

    Donut donut = new Donut();
    donut.parametr(true);
    donut.parametr(10);
    donut.parametr("pink");
    donut.parametr(5);

    Car car = new Car();
    car.left.window.rollup();
    car.wheels[0].inflate(73);
    car.engine.service();

    Viol.viol();

    Frog frog = new Frog();
    frog.frog();
    frog.blood(frog);
    frog.water(frog);
    frog.eat(frog);

        FinalData fd = new FinalData();
        FinalData.vasiy++;
        //fd.a++;
        //fd.A++;
        int data1 = fd.a.i++;
        int data2 = fd.A.i++;
        //fd.a = new Value(1);
        //fd.A = new Value(1);
        //fd.t++;
        //fd.T++;
        //fd.t = 50;
        //fd.T = 50;
        System.out.println(data1);
        System.out.println(data2);

        FinalBlank blank = new FinalBlank();
        //blank.v++;
        int data = blank.v.i++;
        //blank.v = new Value(44);
        System.out.println(data);

        System.out.println("Constructor Beets");
        Beets b = new Beets();

    }
}
