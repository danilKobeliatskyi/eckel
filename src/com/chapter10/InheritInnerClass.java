package com.chapter10;

public class InheritInnerClass extends BaseWithInnerClass.Inner{
    InheritInnerClass(BaseWithInnerClass wi){
        wi.super();
        System.out.println("\nInherit from inner class");
    }
}
