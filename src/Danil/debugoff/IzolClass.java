package Danil.debugoff;

import Danil.debug.IzolInterface;

public class IzolClass {

    protected class InnerIzolClass implements IzolInterface {

        public void name(){

            System.out.println("Izol inner class");
        }

        InnerIzolClass() {

            name();
        }
    }

    public InnerIzolClass innerContext(){

        return new InnerIzolClass();
    }
}
