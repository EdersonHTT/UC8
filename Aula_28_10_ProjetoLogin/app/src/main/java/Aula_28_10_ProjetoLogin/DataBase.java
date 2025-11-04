package Aula_28_10_ProjetoLogin;

import java.util.ArrayList;
import java.util.Arrays;

public class DataBase {

    // Lista que simula o banco de dados
    private static final ArrayList<User> users = new ArrayList<>();

    // Método para adicionar um usuário
    public static void addUser(User usuario) {
        users.add(usuario);
    }
    // Método para retornar todos os usuários
    public static ArrayList<User> getUsers() {
        return users;
    }

    // Método para buscar usuário pelo email e senha
    public static User verify(String email, char[] senha) {
        for (User user : users) {
            if (user.getEmail().equals(email) && Arrays.equals(user.getPassword(), senha)) {
                return user; // usuário encontrado
            }
        }
        return null;
    }

    // Método para atualizar dados de um usuário
    public static boolean put(String emailAntigo, String novoNome, String novoEmail, char[] novaSenha) {
        for (User user : users) {
            if (user.getEmail().equals(emailAntigo)) {
                user.setName(novoNome);
                user.setEmail(novoEmail);
                user.setPassword(novaSenha);
                return true; 
            }
        }
        return false; 
    }

    // Método para remover um usuário
    public static boolean delete(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                users.remove(user);
                return true;
            }
        }
        return false;
    }
}