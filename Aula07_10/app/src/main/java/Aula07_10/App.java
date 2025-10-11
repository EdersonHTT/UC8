
package Aula07_10;

import java.util.Arrays;
import java.util.OptionalDouble;

public class App {
    public static void main(String[] args) {
//        int[] numeros = new int[3];
//        
//        for (int i = 0; i < numeros.length; i++) {
//           numeros[i] = i;
//           System.out.println(numeros[i]);
//        }
//
//        String[] nomes = {"Pai do kauan", "Guregure", "Ederson"};
//        
//        for (int i = 0; i < nomes.length; i++) {
//           numeros[i] = i;
//           System.out.println(nomes[i]);
//        }
//        
//        System.out.println(Math.floor(Math.random()*3)+1);
//        
        
        //////////////////////////////////////
        
        int[] numeros = new int[6];
        
        numeros[0] = 6;
        numeros[1] = 2;
        numeros[2] = 5;
        numeros[3] = 4;
        numeros[4] = 3;
        numeros[5] = 1;
        
        System.out.println("Nao ordenado");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        Arrays.sort(numeros);
        
        System.out.println("\n\nOrdenado");
        
//            for (int i = 0; i < numeros.length; i++) {
//                System.out.println(numeros[i]);
//            }
        String texto = Arrays.toString(numeros);
        System.out.println(texto); 
        
        /////////////////////// procura no array
        
        int index = Arrays.binarySearch(numeros, 6);
        System.out.println("\n\n" + index);
        /////////////////////////// ve se é igual
        int[] a = {1,2,3};
        int[] b = {1,2,3};
        
        System.out.println(Arrays.equals(a, b));
        
        ///////////////////////////// muda tudo
        int[] notas = {30, 20, 90};
        
        Arrays.fill(notas, 10);
        System.out.println(Arrays.toString(notas));
        
        /////////////////////////// Copias
        
        int[] copia = Arrays.copyOf(notas, 10);
        System.out.println("Copia: " + Arrays.toString(copia));
        
        String[] paises = {"Brasil", "Russia", "India", "China", "Africa do Sul"};
        String[] copiaPaises = Arrays.copyOfRange(paises, 1, 4);
        System.out.println("Copia paises: " + Arrays.toString(copiaPaises));
        
        ///////////////////////////// dar poder ao array de fazer operacoes
        
        int[] meusNumeros = { 1, 2, 3, 4 };
        int soma = Arrays.stream(meusNumeros).sum();// soma
        OptionalDouble media = Arrays.stream(meusNumeros).average();// soma

        System.out.println("\n\nSoma do array: " + soma);        
        System.out.println("Media do array: " + media);

        int[] numbers = {3, 5, 2, 6, 2,};
        
        Arrays.stream(numbers)
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }
    
}
