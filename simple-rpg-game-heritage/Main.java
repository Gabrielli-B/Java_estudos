package com.myRpgGame;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Arthur");
        Mage mage = new Mage ("Merlin",1);

        warrior.info();
        mage.info();

        CharacterActions.attack(warrior,mage);
        CharacterActions.repairArmor(mage);
        CharacterActions.repairArmor(mage);

        CharacterActions.attack(warrior,mage);
        CharacterActions.attack(warrior,mage);
        CharacterActions.repairArmor(mage);
        CharacterActions.repairArmor(mage);
        CharacterActions.attack(warrior,mage);
        CharacterActions.attack(warrior,mage);
        CharacterActions.attack(warrior,mage);

        CharacterActions.increaseStrength(mage);

        CharacterActions.attack(mage,warrior);
        CharacterActions.attack(mage,warrior);
        CharacterActions.attack(mage,warrior);

        CharacterActions.repairArmor(mage);
        CharacterActions.repairArmor(mage);

        CharacterActions.attack(warrior,mage);


    }
}
