//Desafio SenhaForte
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String senha = sc.nextLine();

        int aux = 0;

        if (senha.length() < 6) {
            aux = 6 - senha.length();


        }
      
        System.out.println(aux);


    }
    
}
