package com.company;

public class Main {

    static final String S = "World";

    public static void main(String[] args) {
	Test t = new Test();
	Test t2 = new Test(S);
    }
}

class Test {
    Test (){
        System.out.println("Hello");
    }
    Test (String S){
        System.out.println("Hello" + S);
    }
}
