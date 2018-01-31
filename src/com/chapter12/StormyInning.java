package com.chapter12;

public class StormyInning extends Inning implements Storm {
    public StormyInning() throws UmpireArgument, RainedOut, BaseballException {}
    public StormyInning(String s) throws Foul, BaseballException {}
    public void rainHard() throws RainedOut {}
    public void event() {}

    public void atBat() throws PopFoul, ThrownFromGame {
        throw new ThrownFromGame();
    }
    public void questionableCall() throws UmpireArgument {
        throw new UmpireArgument();
    }
    public static void main(String[] args) {
        try {
            StormyInning stormyInning = new StormyInning();
            stormyInning.atBat();
            stormyInning.questionableCall();
        } catch(PopFoul e) {
            System.out.println("Pop foul");
        } catch(UmpireArgument e) {
            System.out.println("Umpire argument (StormyInning20)");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        try {
            Inning inning = new StormyInning();
            inning.atBat();
        } catch(Strike e) {
            System.out.println("Strike");
        } catch(Foul e) {
            System.out.println("Foul");
        } catch(ThrownFromGame e) {
            System.out.println("Thrown from game (Inning)");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
}
