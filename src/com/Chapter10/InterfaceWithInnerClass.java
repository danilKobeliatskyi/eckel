package com.Chapter10;

public interface InterfaceWithInnerClass {
    void print();
    class InnerInInterface implements InterfaceWithInnerClass{
        public void print(){
            System.out.println("Inner class in interface");
        }
    }
}
