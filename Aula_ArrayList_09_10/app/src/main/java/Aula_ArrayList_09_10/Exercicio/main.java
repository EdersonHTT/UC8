
package Aula_ArrayList_09_10.Exercicio;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class main {
    static ArrayList<Item> itens = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean continuar = true;
        
        do {
            System.out.println("Actions:"
                    + "\n1 -> adicionar"
                    + "\n2 -> mostrar"
                    + "\n3 -> Pagar"
                    + "\n4 -> sair");
            System.out.println("Acao: ");
            
            String action = scan.nextLine();
           
            switch (action) {
                case "1":
                    System.out.println("Escolha o Item:"
                            + "1 -> Batata"
                            + "2 -> Pepino"
                            + "3 -> Pera");
                    adicionar(scan.nextLine());
                    break;
                case "2":
                    double total = 0;
                    itens.forEach(item -> { System.out.println("Item: " + item.nome + " | Valor: " + item.valor ); });
                    System.out.println("Total: " + total);
                    System.out.println("Continuar...");
                    break;
                case "3":
                    System.out.println("Pago Com sucesso");
                    itens.clear();
                    System.out.println("Continuar...");
                    break;
                case "4":
                    System.out.println("Saindo...");
                    continuar = false;
                    break;
                default:
                    throw new AssertionError();
            }
        } while(continuar);
    }
    
    public static void adicionar(String option) {
        switch(option) {
            case "1":
                itens.add(new Batata());
                break;
            case "2":
                itens.add(new Pepino());
                break;
            case "3":
                itens.add(new Pera());
                break;
            default:
                System.out.println("Item não encontrado");
                return;
        }
        
        System.out.println("Adicionado ao carrinho");
    }
}
