package com.myRpgGame;

public class GameCharacter {
    private String name;
    private int hp;
    private Boolean alive;
    private int strength;
    private int armor;

    public GameCharacter(String name){
        this.name = name;
        this.hp = 0;
        this.alive = false;
        this.strength = 0;
        this.armor = 0;
    }
    public String getName(){
        return this.name;
    }
    public int getHp(){
        return this.hp;
    }
    public Boolean getAlive(){
        return this.alive;
    }

    public int getStrength() {
        return strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setStrength(int strength){
        this.strength=strength;
    }
    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setArmor(int armor){
        this.armor = armor;
    }

    //public void takeDamage(int damage){
      //  this.hp -= damage ;
    //}
    public void characterDamage(int damage){
        this.hp -= damage;
        if(hp <= 0){
            this.alive = false;
        }
    }
    public void attack(int strength){
        if(armor > 0){
            if(strength >= armor){
                strength -= armor;
                armor=0;
                System.out.println("Armadura destruída!");

            }else{
                armor -= strength;
                strength = 0;
            }
        }
        if(strength > 0){
            characterDamage(strength);
        }
        System.out.println("HP: " + getHp() + " | Armadura: " + armor);
        System.out.println("----------------------");
    }

    public Boolean statusArmor() {
        return armor > 0; // Se a armadura é maior que 0, está ativa
    }
    public void info(){
        System.out.println("----------------------");
        System.out.println("Nome personagem  ------ "+ getName());
        System.out.println("Status vida personagem ------ "+getAlive());
        System.out.println("HP do personagem ------ "+getHp());
        System.out.println("Armadura do personagem ---- " + getArmor() );
        System.out.println("-----------------------------------------------");
    }
}
