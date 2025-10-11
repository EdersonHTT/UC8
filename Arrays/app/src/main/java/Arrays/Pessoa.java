package Arrays;

public class Pessoa {
    private String nome;
    private int idade;
   
    private double peso;
    
    public Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }
    
    public void andar() {
            System.out.println("Pessoa esta andando!");
    }
    
    public static void speak() {
            System.out.println("Pessoa esta falando!");
    }

     public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
}
