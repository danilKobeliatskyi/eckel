package com.chapter7;

class Value{

    int i;
    public Value(int i){
        this.i = i;
    }
}

public class FinalData {

    public static int vasiy = 50;

    public static Value A = new Value(20);
    public final Value a = new Value(10);
    public static final int T = 30;
    public final int t = 40;
}

class FinalBlank {

    public final Value v;

    FinalBlank(){
        v = new Value(33);
    }
}
