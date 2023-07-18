package Ficha2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        double salario;

        // Ler valores do utilizador
        System.out.println("Insira o seu salario");
        salario = input.nextDouble();

        //a. Salario até 15.000€ paga taxa de 20%

        if (salario<=15000){
            salario=salario*0.2;
            System.out.println("Taxa a pagar 20%: "+salario);

       //b. Salario superior a 15.000€ paga taxa de 30%

        }else{
            salario=salario*0.3;
            System.out.println("Taxa a pagar 30%: "+salario);

        }







    }
}