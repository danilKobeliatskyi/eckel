package danil.chapter8;

public class AlertStatus {

    private Ship ship = new Starship();

    public void alertLow(){

        ship = new StarshipLowAlert();
    }

    public void alertMiddle(){

        ship = new StarshipMiddleAlert();
    }

    public void alertHigh(){

        ship = new StarshipHighAlert();
    }

    public void status(){

        ship.ship();
    }
}
