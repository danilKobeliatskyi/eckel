package com.chapter9;

public class Transformation {

    public void transformation(String s){

        char[] ch = s.toCharArray();

        //String s1;

        for(char a, i = 0; i < ch.length - 1; i += 2) {
            a = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = a;
        }

        String s1 = new String(ch);
        System.out.println(s1);
    }
}
