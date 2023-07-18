package Ficha2;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis

        double saldo, montante;

// Ler valores do utilizador
        System.out.println("Insira o saldo da sua conta bancaria");
        saldo = input.nextDouble();

        System.out.println("Insira o montante a creditar (+) ou debitar(-)");
        montante = input.nextDouble();

        if(saldo+montante>0){
            saldo=saldo+montante;
            System.out.println("Operaçao valida, realizada com sucesso. O seu saldo atual é de : "+saldo);
        }

        if(saldo+montante<0){
            System.out.println("Operaçao invalida, nao tem saldo suficiente");
        }




    }
}
