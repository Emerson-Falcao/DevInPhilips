package semana1;


public class Exercicio5 {

    public static void exercicio5(int[] valores){
        if(valores!=null){
        int maior = valores[0];
        int menor = valores[0];
            for (int i = 0; i < valores.length; i++) {
                if(valores[i]>maior)
                    maior = valores[i];
                if(valores[i]<menor)
                    menor = valores[i];
            }
            System.out.println("Maior valor: "+maior);
            System.out.println("Menor valor: "+menor);
        }else{
            System.out.println("Não é possível calcular");
        }
        
    }

}