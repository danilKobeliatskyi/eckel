package com.company;

public class Tank {
    public boolean tank() {
        int max = 1;
        int random = (int)(Math.random()* ++ max);
        boolean tankFull;

        if (random == 1) {
            tankFull = true;
        }
        else tankFull = false;
        return tankFull;
    }

    public void finalize(){
        if ((tank() == true)) {
            System.out.println("Error");
        }
        else System.out.println("Okey");
    }
}
