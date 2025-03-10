package co.gabrielli;

import java.util.UUID;

public class User {
    private String nameUser;
    private String password;
    private int id;

    public User(String nameUser, String password){
        this.nameUser = nameUser;
        this.password = hashPassword(password);
        this.id = generateId();
    }

    private int generateId(){
        return Math.abs(UUID.randomUUID().hashCode());
    }
    private String hashPassword(String password){
        return Integer.toHexString(password.hashCode());
    }

    public String getNameUser(){
        return nameUser;
    }
    public int getId(){
        return id;
    }
    public String getPassword(){
        return password;
    }
}
