package com.chapter9;

public class CoinFactory implements TrowFactory {

    public Throw getTrow(){

        return new Coin();
    }
}
