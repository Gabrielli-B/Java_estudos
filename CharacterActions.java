package com.myRpgGame;


public class CharacterActions {

    public static void attack( GameCharacter attacker, GameCharacter target) {
        if (target.getAlive()) {
            System.out.println(attacker.getName() + " ataca " + target.getName() + " ! ");
            target.attack(attacker.getStrength());
        } else {
            System.out.println(target.getName() + " já está derrotado! ");
        }
    }

    public static void repairArmor(GameCharacter character){
        int aux = character.getArmor();
        character.setArmor(aux+20);
        System.out.println("----------------------");
        System.out.println("Personagem " + character.getName());
        System.out.println("Armadura reparada para ------  " + character.getArmor());
        System.out.println("----------------------");
    }

    public static void increaseStrength(GameCharacter character){
        int aux = character.getStrength();
        character.setStrength(aux+10);
        System.out.println("----------------------");
        System.out.println("Personagem " + character.getName());
        System.out.println("Força aumentada ------  " + character.getStrength());
        System.out.println("----------------------");

    }

}
