package Danil.chapter8;

class Game {

    int players(int p) {

        game();
        System.out.println(p + " players");
        return p;
    }

    void game() {

        System.out.println("In this game can play");

    }
}

public class Footbol extends Game{

    void game(){

        System.out.println("In footbol can play");
    }
}
