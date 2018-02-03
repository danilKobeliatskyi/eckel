package Danil.chapter10;

public class GreenHouseControls extends Controller {
    private boolean light = false;
    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            light = true;
        }

        public String toString() {
            return "Light on";
        }
    }

    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            light = false;
        }

        public String toString() {
            return "Light off";
        }
    }

    private boolean water = false;
    public class WaterOn extends Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            water = true;
        }

        public String toString() {
            return "Water on";
        }
    }

    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            water = false;
        }

        public String toString() {
            return "Water off";
        }
    }

    private String thermostat = "Day";
    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        public void action() {
            thermostat = "Night";
        }

        public String toString() {
            return "Thermostat in night mode";
        }
    }

    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        public void action() {
            thermostat = "Day";
        }

        public String toString() {
            return "Thermostat in day mode";
        }
    }

    private boolean aeration = false;
    public class AerationOn extends Event {
        public AerationOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            aeration = true;
        }

        public String toString() {
            return "Aeration on";
        }
    }

    public class AerationOff extends Event {
        public AerationOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            aeration = false;
        }

        public String toString() {
            return "Aeration off";
        }
    }

    public class Bell extends Event{
        public Bell(long delayTime) {
            super(delayTime);
        }
        public void action() {
            addEvent(new Bell(delayTime));
        }

        public String toString(){
            return "Bam";
        }
    }

    public class Restart extends Event{
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList){
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList)
                addEvent(e);
        }

        public void action(){
            for (Event e : eventList){
                e.start();
                addEvent(e);
            }
        start();
            addEvent(this);
        }

        public String toString(){
            return "Restart of system";
        }
    }

    public static class Terminate extends Event{
        public Terminate(long delayTime){
            super(delayTime);
        }
        public void action(){
            System.exit(0);
        }

        public String toString() {
            return "Disconnection";
        }
    }

    public static void main(String[] args){
        BetterGreenHouse gs = new BetterGreenHouse();
        gs.addEvent(gs.new Bell(900));
        Event[] eventList = new Event[]{
                gs.new ThermostatNight(0),
                gs.new LightOn(200),
                gs.new LightOff(400),
                gs.new WaterOn(600),
                gs.new WaterOff(800),
                gs.new AerationOn(1000),
                gs.new AerationOff(1200),
                gs.new WettingOn(1250),
                gs.new WettingOff( 1325),
                gs.new ThermostatDay(1400)
        };
        gs.addEvent(gs.new Restart(2000, eventList));
        if (args.length == 1)
            gs.addEvent(
                    new GreenHouseControls.Terminate(
                            new Integer(args[0])));
        gs.run();
    }
}


