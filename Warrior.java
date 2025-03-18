package com.myRpgGame;

public class Warrior extends GameCharacter{

    public Warrior(String name){
        super(name);
        super.setAlive(true);
        super.setHp(1000);
        super.setStrength(60);
        super.setArmor(100);
    }


}
