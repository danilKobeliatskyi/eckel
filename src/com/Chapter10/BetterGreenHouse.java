package com.Chapter10;

public class BetterGreenHouse extends GreenHouseControls{

    private boolean wetting = false;
    public class WettingOn extends Event {
        public WettingOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            wetting = true;
        }

        public String toString() {
            return "Wetting on";
        }
    }

    public class WettingOff extends Event {
        public WettingOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            wetting = false;
        }

        public String toString() {
            return "Wetting off";
        }
    }
}
