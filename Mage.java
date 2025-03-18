package com.myRpgGame;

public class Mage extends GameCharacter{
    //private int typePower;

    public Mage(String name, int typePower){
        super(name);
        super.setAlive(true);
        super.setArmor(120);
        setTypePower(typePower);
    }

    public void setTypePower(int typePower){
        switch (typePower){
            case 1:
                super.setStrength(30);
                super.setHp(1150);
                break;
            case 2:
                super.setStrength(20);
                super.setHp(1100);
                break;
            case 3:
                super.setStrength(10);
                super.setHp(1150);
                break;
            default:
                super.setStrength(10);//padrão
                super.setHp(1150);
                break;
        }
    }
}

