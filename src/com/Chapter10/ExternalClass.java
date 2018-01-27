package com.Chapter10;

public class ExternalClass {

    static class InnerClass implements InterfaceForInnerClass {

        public void description() {
            System.out.println("Inner class implements interface");
        }

        InnerClass innerClass(){
            description();
            return new InnerClass();
        }
    }
}
