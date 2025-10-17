
package Aula_ArrayList_09_10.Exercicio;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class main {
    static ArrayList<Item> itens = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        
        Batata batata = new Batata();
        
        batata.toString();
        
        do {
            System.out.println("Actions:"
                    + "\n1 -> Adicionar"
                    + "\n2 -> Mostrar"
                    + "\n3 -> Remover"
                    + "\n4 -> Pagar"
                    + "\n5 -> Sair");
            System.out.println("Acao: ");
            
            String action = scan.nextLine();
           
            switch (action) {
                case "1":
                    System.out.println("Escolha o Item:"
                            + "\n1 -> Batata"
                            + "\n2 -> Pepino"
                            + "\n3 -> Pera");
                    adicionar(scan.nextLine());
                    break;
                case "2":
                    double total = 0;
                    for(int i = 0; i < itens.size(); i++) {
                        System.out.println("id: " + (i + 1) + " | Nome: " + itens.get(i).nome + " | Valor: " + itens.get(i).valor );
                        total += itens.get(i).valor;
                    }
                    System.out.println("Total: " + total);
                    System.out.println("Continuar...");
                    break;
                case "3":
                    System.out.println("Digite o id do item que deseja remover:");
                    int remover = scan.nextInt();
                    
                    if(remover > 0 && remover <= itens.size()) {
                        itens.remove(remover -1);
                        System.out.println("Renovido com sucesso!");
                    } else {
                        System.out.println("Valor Invalido!");
                    }
                    
                    break;
                case "4":
                    System.out.println("Pago Com sucesso");
                    itens.clear();
                    System.out.println("Continuar...");
                    break;
                case "5":
                    System.out.println("Saindo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Nada!");
                    break;
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
