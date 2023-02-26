package semana1;

public class Exercicio9 {

    public static void exercicio9() {
        int[] sequencia = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        for(int num : sequencia){
            if(num%3==0)
                System.out.println("PIM");
            else
                System.out.println(num);
        }
    }
}