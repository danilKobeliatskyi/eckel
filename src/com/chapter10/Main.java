package com.chapter10;

import java.util.Iterator;

import static com.chapter10.HorrorShow.u;

public class Main {

    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = outer.content();
        Outer.Inner outerInner = new Outer.Inner();
        outerInner.toString();


        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Iterator iter = sequence.iterator();
        while (iter.hasNext())
            System.out.print(iter.next() + " ");
        System.out.println("\n");

        Conclusion conclusion = new Conclusion();
        Inheritor inheritor = new Inheritor();
        inheritor.create();

        CloseClass closeClass = new CloseClass();
        closeClass.result();

        ExternalClass ec = new ExternalClass();
        InterfaceForInnerClass i = ec.contents();
        i.description();

        ExternalClass2 ex2 = new ExternalClass2();

        HorrorShow horrorShow = new HorrorShow();
        Monster barney = new DragonZilla();
        u(barney);
        Monster vlad = new VeryBadVampire();
        u(vlad);

        ClassWhithLink classWhithLink = new ClassWhithLink();

        WithNestedClass.NestedClass n = new WithNestedClass.NestedClass();
        n.nestedClass();

        Sheath.InnerClassFirstLevel.InnerClassSecondLevel secondLevel = new Sheath.InnerClassFirstLevel.InnerClassSecondLevel();
        secondLevel.innerSecondLevel();

        InterfaceWithInnerClass.InnerInInterface innerInInterface = new InterfaceWithInnerClass.InnerInInterface();
        innerInInterface.result();

        A a = new A();
        a.u().name();
        a.u().print();
        a.u().where();

        BaseWithInnerClass wi = new BaseWithInnerClass();
        InheritInnerClass ii = new InheritInnerClass(wi);
    }
}
