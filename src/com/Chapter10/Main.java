package com.Chapter10;

import static com.Chapter10.HorrorShow.u;

public class Main {

    public static void main(String[] args){

        Outer outer = new Outer();
        Outer.Inner inner = outer.content();
        Outer.Inner outerInner = new Outer.Inner();
        outerInner.toString();


        Sequence sequence = new Sequence(10);
        Sequence sequence1 = new Sequence();
        for(int i = 0; i < 10; i ++)
            sequence.add(Integer.toString(i));

        Selector selector = sequence.selector();
        while (!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }

        Conclusion conclusion = new Conclusion();
        Inheritor inheritor = new Inheritor();
        inheritor.create();

        CloseClass closeClass = new CloseClass();
        closeClass.result();

        ExternalClass ec = new ExternalClass();
        InterfaceForInnerClass i = ec.contents();
        i.description();

        ExternalClass2 ex2= new ExternalClass2();

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
    }
}
