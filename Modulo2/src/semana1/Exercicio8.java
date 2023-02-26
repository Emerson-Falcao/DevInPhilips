package semana1;

import java.util.Arrays;
import java.util.List;


public class Exercicio8 {

    public static void exercicio8(){
        List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);
        for(int num : numeros){
            if(num>50){
                System.out.println(num);
                break;
            }
        }
    }

}