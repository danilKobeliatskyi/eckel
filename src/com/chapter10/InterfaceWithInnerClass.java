package com.chapter10;

public interface InterfaceWithInnerClass {
    void print();
    class InnerInInterface implements InterfaceWithInnerClass{
        static void result(){
            new InnerInInterface().print();
        }
        public void print(){
            System.out.println("Inner class in interface");
        }
    }
}
