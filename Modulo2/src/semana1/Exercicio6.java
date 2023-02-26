package semana1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Exercicio6 {


    public static void exercicio6(){
        List<Integer> lista = Arrays.asList(1,2,3,4);
        List<Integer> novaLista = new ArrayList();
        for(int i : lista){
            novaLista.add(i*3);
        }
        for(int j : novaLista){
            System.out.println(j);
        }
    }
    
}