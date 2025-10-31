package Aula_28_10_ProjetoLogin;


import java.util.ArrayList;
import java.util.Arrays;


public class DataBase {
    // Lista que simula o banco de dados
    public static ArrayList<User> users = new ArrayList<>();
    
    // Metodo para adicionar um usuario
    public static void addUser(User user) {
        users.add(user);
    }
    
    // Metodo para retornar todos os usuarios
    public static ArrayList<User> getUser() {
        return users;
    }
    
    // Metodo par abuscar usuarios pelo email e senha
    public static User verify(String email, char[] password) {
        for (User user: users) {
            if(user.getEmail().equals(email) && Arrays.equals(password, user.getPassword())) {
                return user; // usuario encontrado
            }
        }
        return null; // usuario n encontrado
    }
    
}
