package danil.chapter7;

class CleanserDelegation {
    public String s = "Cleanser";
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

public class DetergentDelegation {
    String name;
    CleanserDelegation delegation = new CleanserDelegation();
    public DetergentDelegation(String name){
        this.name = name;
    }
    public void dilute(int number){
        delegation.dilute();
    }
    public void apply(int number){
        delegation.apply();
    }
    public void scrub(int number){
        delegation.scrub();
    }
    public String s = delegation.s;
}
