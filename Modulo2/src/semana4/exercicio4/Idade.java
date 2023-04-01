package semana4.exercicio4;

import java.util.Scanner;


public class Idade {

    public void perguntaIdade(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a sua idade:");
        int idade = scan.nextInt();
        try {
            this.verificarIdade(idade);
        } catch (IdadeException ex) {
            System.out.println(ex);
            this.perguntaIdade();
        }
        
    }
    
    public void verificarIdade(int idade) throws IdadeException{
        if(idade<=0||idade>100){
           throw new IdadeException("Idade Inválida, informe valor maior que 0 e menor que 100");
        }
    }

}