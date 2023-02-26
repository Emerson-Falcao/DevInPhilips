package semana1;

import java.util.Arrays;
import java.util.List;


public class Exercicio7 {

    public static void exercicio7(){
        List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        for(String nome : nomes){
            System.out.println(nome);
        }
        int i = 0;
        while(nomes.size()>i){
            System.out.println(nomes.get(i));
            i++;
        }
    }

}