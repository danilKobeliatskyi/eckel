package danil.chapter9;

public class Music {

    static void tune(Playable i){

        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Playable[] e){

        for (Playable i : e)
            tune(i);
    }
}
