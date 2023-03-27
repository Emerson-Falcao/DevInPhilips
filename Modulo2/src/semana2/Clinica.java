package semana2;

import java.util.ArrayList;


public class Clinica {

    private String nomeDono;
    private String nomeClinica;
    private String cnpj;
    private String endereco;
    private int codigoClinica;
    private ArrayList<Cliente> clientes;

    public Clinica(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public Clinica(String nomeDono, ArrayList<Cliente> clientes) {
        this.nomeDono = nomeDono;
        this.clientes = clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getCodigoClinica() {
        return codigoClinica;
    }

    public void setCodigoClinica(int codigoClinica) {
        this.codigoClinica = codigoClinica;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeClinica() {
        return nomeClinica;
    }

    public void setNomeClinica(String nomeClinica) {
        this.nomeClinica = nomeClinica;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    
    public double calculoIMC(double peso, double altura){
        
        double imc = peso / altura*altura;
        
        if(imc < 18.5)
            System.out.println("Abaixo do peso normal");
        else if(imc < 24.9)
            System.out.println("Peso normal");
        else if(imc <29.9)
            System.out.println("Excesso de peso");
        else if(imc <34.9)
            System.out.println("Obesidade I");
        else if(imc <39.9)
            System.out.println("Obesidade II");
        else 
            System.out.println("Obesidade III");
        
        return imc;
    }
    
    public double tratamento(int idCliente){
        
        double peso = 0;
        
        if(idCliente > this.clientes.size())
            System.out.println("Cliente não encontrado");
        else{
            this.clientes.get(idCliente).setPeso(this.clientes.get(idCliente).getPeso()-5);
            peso = this.clientes.get(idCliente).getPeso();
        }
        return peso;
    }
    
    public double tratamento(int idCliente, double diminuicao){
        
       double peso = 0;
        
        if(idCliente > this.clientes.size())
            System.out.println("Cliente não encontrado");
        else{
            this.clientes.get(idCliente).setPeso(this.clientes.get(idCliente).getPeso()-diminuicao);
            peso = this.clientes.get(idCliente).getPeso();
        }
        return peso;
    }
    
}