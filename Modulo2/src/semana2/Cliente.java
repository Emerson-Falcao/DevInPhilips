package semana2;


public class Cliente {


    private double peso;
    private double altura;
    private int idade;
    private String nome;

    public Cliente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public Cliente(double peso, double altura, int idade, String nome) {
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}