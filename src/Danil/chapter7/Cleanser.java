package danil.chapter7;

public class Cleanser {
    public static String s = "Cleanser";
    public void append(String a){s += a; }
    public void dilute(){append(" dilute()");}
    public void apply(){append(" apply()");}
    public void scrub(){append(" scrub()");}
    public String toString(){return s;}
    public static void main(String[] args){
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

class Detergent extends Cleanser{
    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }
    public void foam(){append("foam()");}
    public static void main(String[] args){
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        Cleanser.main(args);
    }
}


class Inheritor extends Detergent{
    public void scrub(){
        append(" Inheritor.scrub()");
        super.scrub();
    }
    public void sterilize(){append(" sterilize()");}
    public static void main(String[] args){
        Inheritor x = new Inheritor();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        System.out.println(x);
        Detergent.main(args);
    }
}