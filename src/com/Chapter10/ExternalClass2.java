package com.Chapter10;

public class ExternalClass2 {

    private class In implements InterfaceForInnerClass{
        In(){
            description();
        }
        public void description(){
            System.out.println("Private inner class, implements interface");
        }
    }
        In in(){
            return new In();
        }
}
