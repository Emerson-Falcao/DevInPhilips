package semana4.exercicio5;


public class Aluno extends Pessoa{

    private String matricula;
    
    public String registrar(){
        return "Sou o"+super.obterNomeCompleto()+" e minha matricula é "+this.matricula;
    }

}