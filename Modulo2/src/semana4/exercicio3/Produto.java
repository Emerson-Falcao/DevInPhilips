package semana4.exercicio3;


public class Produto implements Tributavel{

    double valor;
    double valorImposto;

    @Override
    public double calcularValorComImposto() {
        return valor+valorImposto;
    }

}