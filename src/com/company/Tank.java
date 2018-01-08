package com.company;

public class Tank {
    public boolean tank(){
        boolean tankFull = true;
        return tankFull;
    }
    public void finalize(){
        if ((tank() == true)) {
            System.out.println("Error");
        }
        else System.out.println("Okey");
    }
}
