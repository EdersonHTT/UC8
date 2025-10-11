
package Arrays;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
//        System.out.println("garoto de programa!");
//        
//        Pessoa pessoa = new Pessoa("Ederson", 17, 60.50);
//        
//        pessoa.andar();
//        Pessoa.speak();
        
        // --------------- array
        
        
        int[] numeros = new int[5]; // - ja cria com o valor [0,0,0,0,0]
        
        numeros[0] = 3;      
        numeros[1] = 2;
        numeros[2] = 6;
        numeros[3] = 4;        
        numeros[4] = 1;
        
        String[] nomes = {"Ederson", "Pai do Kaua", "Guregure"};
        
        for (int i=0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        
        System.out.println("\n\nArray não ordenado");
        for (int i=0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        Arrays.sort(numeros);
        
        System.out.println("\n\nArray ordenado");
        for (int i=0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        System.out.println("\n\nArray String");
        System.out.println(Arrays.toString(numeros));
    }
}
