package Ficha2;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
int operacao;

// Ler valores do utilizador
        System.out.println("Escolha uma opçao do menu 1.Criar, 2.Atualizar, 3.Eliminar, 4.Sair");
operacao=input.nextInt();



switch(operacao){

    case 1:
        System.out.println("Criar");

        break;

    case 2:
        System.out.println("Atualizar");

        break;
    case 3:
        System.out.println("Eliminar");

        break;
    case 4:
        break;


    default:
        System.out.println("Operacao invalida");
        break;

}






    }
}