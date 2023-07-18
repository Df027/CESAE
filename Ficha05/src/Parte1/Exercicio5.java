package Parte1;

import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);


        // Criar um vetor-array(numero) com 10 posições

double[] numero = new double[10];
double soma = 0;
double media;

        for (int i=0; i<10; i++){
            System.out.println("Introduza un numero: ");
            numero[i] = input.nextDouble();
// [i] guarda o numero. Começa em 0 para poder adicionar mais numeros (10x)
// O ciclo (for) corre e vai adicionando cada vez mais 1 (i++) até chegar a 10 (i<10)
        }


        for(int i=0; i<10;i++){
            soma=soma+numero[i];


        }
        media=soma/10;
        System.out.println("A media dos elementos é" +media);

    }





    }


