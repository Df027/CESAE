package Ficha2;

import java.util.Scanner;
import java.util.Set;

public class Exercicio1 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        int num1,num2;

        // Ler valores do utilizador
        System.out.print("Insira um numero: ");
        num1 = input.nextInt();
        System.out.print("Insira outro numero: ");
        num2 = input.nextInt();

if (num1>num2){
    System.out.println("O numero maior é"+num1);
}else{
    System.out.println("O numero maior é"+num2);

}

    }
}