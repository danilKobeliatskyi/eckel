package danil.chapter10;

public class DragonZilla implements Monster {
    Monster dangerousMonster(){
        return new Monster() {
            @Override
            public void menace() { }
            void destroy() {}
        };
    }
    public void menace(){}
    DragonZilla() {
        menace();
        dangerousMonster();
    }
}
