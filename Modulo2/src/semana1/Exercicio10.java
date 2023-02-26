package semana1;


public class Exercicio10 {

    public static void exercicio10(String palavra){
        String invertida = "";
        char[] palavraArray = palavra.toLowerCase().toCharArray();
        for(int i = palavraArray.length-1; i >= 0; i-- ){
            invertida += palavraArray[i];
        }
        if(invertida.equals(palavra.toLowerCase()))
            System.out.println("Palindromo");
        else
            System.out.println("Não é palindromo");
    }

}