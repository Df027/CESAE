package Ficha2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        double salario;

        // Ler valores do utilizador
        System.out.println("Insira o seu salario");
        salario = input.nextDouble();


        if(salario<=15000){
            salario=salario*0.2;
                System.out.println("Taxa de 20%"+salario);

            }else if(salario>15000 && salario<=20000){
            salario=salario*0.3;
            System.out.println("Taxa de 30%"+salario);

        }else if(salario>20000 && salario <=25000){
            salario=salario*0.35;
            System.out.println("Taxa de 35%"+salario);

        }else if(salario>25000){
            salario=salario*0.4;
            System.out.println("Taxa de 40%"+salario);

        }
        }


    }
