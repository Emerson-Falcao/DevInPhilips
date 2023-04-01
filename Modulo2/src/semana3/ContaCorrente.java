package semana3;


public class ContaCorrente extends Conta implements Operavel{

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Saldo Atual: "+super.obterSaldoAtual());
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("Saldo Atual: "+super.obterSaldoAtual());
    }



}