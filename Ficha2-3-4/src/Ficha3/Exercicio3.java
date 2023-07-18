package Ficha3;

import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis

        int num=0;
        int limite;

        System.out.println("Insira um numero");
        limite=input.nextInt();

while(num<limite){
    num++;
    System.out.println(num);
}

    }
}
