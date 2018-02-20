package danil.chapter5;

enum Valute{
    DOLLARS, EURO, GRIVNA, RUBL, FRANKS, SHEIKEL
}


public class Enum {

    public static void simpleEnum(){
        for (Valute s : Valute.values())
            System.out.println(s + ", ordinal " + s.ordinal());
    }

    Valute countrie;

    public void describe(){
        System.out.println("This valute using in: ");
        switch (countrie) {
            case DOLLARS: System.out.println("USA, Canada and England");
            break;
            case EURO: System.out.println("Europe");
            break;
            case GRIVNA: System.out.println("Ucraine");
            break;
            case RUBL: System.out.println("Russia");
            break;
            case FRANKS: System.out.println("Endland");
            break;
            case SHEIKEL: System.out.println("Israil");
            break;
            default: System.out.println("unknowing valute");
        }
    }

    public Enum(Valute countrie){this.countrie = countrie;}

    public static void countrie(){
        Enum usa = new Enum(Valute.DOLLARS);
        Enum poland = new Enum(Valute.EURO);
        Enum ucraine = new Enum(Valute.GRIVNA);
        Enum russia = new Enum(Valute.RUBL);
        Enum england = new Enum(Valute.FRANKS);
        Enum israil = new Enum(Valute.SHEIKEL);
        usa.describe();
        poland.describe();
        ucraine.describe();
        russia.describe();
        england.describe();
        israil.describe();
    }
}
