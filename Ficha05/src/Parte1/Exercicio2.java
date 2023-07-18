package Parte1;

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Criar um vetor-array com 10 posições
        double [] preco = new double[10];


        for (int i=0; i<10; i++){
            System.out.println("Introduza o preço de um produto");
            preco[i] = input.nextDouble();
// [i] guarda o preço de cada produto. Começa em 0 para poder adicionar
// O ciclo (for) corre e vai adicionando cada vez mais 1 (i++) até chegar a 10 (i<10)
        }

        //o total começa em 0
        double total = 0;

        for(int i=0; i<10;i++){
            total=total+preco[i];
// [i] guarda o preço de cada produto

    }
        System.out.println("A soma total dos produtos é"+total);

    }
}