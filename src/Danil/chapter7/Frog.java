package danil.chapter7;

class Amphibian{

    String eat(Amphibian i){
        System.out.println("eats insects");
        return String.valueOf(i);
    }

    String water(Amphibian i){
        System.out.println("can breathe under water");
        return String.valueOf(i);
    }

    String blood(Amphibian i){
        System.out.println("cold-blooded");
        return String.valueOf(i);
    }
}

public class Frog extends Amphibian{

    void frog(){
        Frog frog = new Frog();
        frog.eat(frog);
        frog.water(frog);
        frog.blood(frog);
    }

    String blood(Amphibian i){
        System.out.println("cold-blooded, because frog, it is amphibian ");
        return String.valueOf(i);
    }

    String eat(Amphibian i){
        System.out.println("eats insects, because frog, it is amphibian");
        return String.valueOf(i);
    }

    String water(Amphibian i){
        System.out.println("can breathe under water, because frog, it is amphibian");
        return String.valueOf(i);
    }
}
