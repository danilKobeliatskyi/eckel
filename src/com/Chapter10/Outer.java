package com.Chapter10;

public class Outer {

    class Inner{

        public void inner(){

            System.out.println("Class Inner");
        }

        Inner(){

            inner();
        }
    }

    public Inner content(){

        return new Inner();
    }


}
