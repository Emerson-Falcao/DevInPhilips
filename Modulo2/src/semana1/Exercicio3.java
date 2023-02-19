package semana1;


public class Exercicio3 {

    public static void exercicio3(){
        int[] extrato = { 100, -35, -15, -5, 55, -20 };
        for (int i = 0; i < extrato.length; i++) {
            System.out.println(extrato[i]);
        }
        for (int i = extrato.length-1; i >= 0; i--) {
            System.out.println(extrato[i]);
        }
        int total = 0;
        for (int i = 0; i < extrato.length; i++) {
            total+=extrato[i];
        }
        System.out.println("Total: "+total);
        if(total<0)
            System.out.println("Saldo Negativo");
        else
            System.out.println("Saldo Positivo");
    }

}