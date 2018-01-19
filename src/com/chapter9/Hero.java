package com.chapter9;

public class Hero extends ActionCharacter implements CanFight, CamSwim, CanFly, CanClimb{

    public void swim(){System.out.println("swim");}
    public void fly(){System.out.println("fly");}
    public void climb(){System.out.println("climb");}
}
