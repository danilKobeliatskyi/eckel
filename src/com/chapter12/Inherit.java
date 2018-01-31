package com.chapter12;

public class Inherit extends Base {
    Inherit() throws BaseException {
        super();
    }

    public static void main(String[] args) {
        try {
            Inherit inherit = new Inherit();
        } catch(BaseException e) {
            System.out.println("BaseException caught in main()");
        }
    }
}
