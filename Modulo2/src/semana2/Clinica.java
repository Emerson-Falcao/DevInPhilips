package semana2;


public class Clinica {

    String nomeDono;
    String nomeClinica;
    String cnpj;
    String endereco;
    int codigoClinica;

    
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
    
}