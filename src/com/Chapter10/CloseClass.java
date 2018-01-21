package com.Chapter10;

public class CloseClass {

    private int close = 19;

    private void closeMetod(){

        System.out.println("Close Class");
    }

    class InnerCloseClass {

        int change(){

            closeMetod();
            close++;
            System.out.println(close);
            return close;
        }
    }

    void result(){

        InnerCloseClass innerCloseClass = new InnerCloseClass();
        innerCloseClass.change();
    }
}
