
package Aula_ArrayList_09_10;

import java.util.Scanner;

public class UsandoScanner {
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome = scan.nextLine();
        int idade = scan.nextInt();
        double peso = scan.nextDouble();

        
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nPeso: " + peso);

    }
}
