package Danil.chapter10;

public class VeryBadVampire implements Monster, Lethal {
    Monster dangerousMonster(){
        return new Monster() {
            @Override
            public void menace() {}
            public void destroy(){}
            public void drinkBlood(){}
        };
    }
    public void menace(){}
    public void kill(){}
    VeryBadVampire(){
    menace();
    kill();
    dangerousMonster();
    }
}
