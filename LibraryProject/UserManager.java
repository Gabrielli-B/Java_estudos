package co.gabrielli;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;
    private List<User> librarians;



    public UserManager(){
        this.users = new ArrayList<>();
        this.librarians = new ArrayList<>();

        //alguns bibliotecários pré definidos
        librarians.add(new User("maria", "1234"));
        librarians.add(new User("jonas", "5678"));
    }
    public void insertUser(User user){
        users.add(user);
    }
    public User authenticate(String userName, String password){
        String hashedInput = Integer.toHexString(password.hashCode());
        for(User user : users){
            if(user.getNameUser().equals(userName) && user.getPassword().equals(hashedInput)){
                return user;
            }
        }
        return null;
    }
    public User generateUser(String name, String password){
        User user = new User ( name, password);
        insertUser(user);
        return user;
    }

    // Métodos para bibliotecários
    public void insertLibrarian(User librarian){
        librarians.add(librarian);
    }
    public User authenticateLibrarian(String userName, String password){
        String hashedInput = Integer.toHexString(password.hashCode());
        for(User librarian : librarians){
            if(librarian.getNameUser().equals(userName) && librarian.getPassword().equals(hashedInput) ){
                return librarian;
            }
        }
        return null;
    }

    public User generateLibrarian(String name, String password){
        User librarian = new User(name, password);
        insertLibrarian(librarian);
        return librarian;
    }
}

