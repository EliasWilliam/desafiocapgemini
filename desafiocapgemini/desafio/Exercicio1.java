 //Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. 
 // A base e altura da escada devem ser iguais ao valor de n. 
 //A última linha não deve conter nenhum espaço.

import java.util.Scanner;
public class Exercicio1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga o tamanho da sua escada? ");

        int n = sc.nextInt();

        for (int altura = 1; altura <= n; altura++);
         int altura;
            for (int espaco = 1; espaco <= n - altura; espaco++) {
            System.out.println(" ");
    
    }

    for (int ast = 1; ast <= altura; ast++) {
        System.out.print("*");
    }
    System.out.println();
    sc.close();

    
    }
 }   

}



