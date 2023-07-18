package Ficha2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis

        double nota1, nota2, nota3, media;

// Ler valores do utilizador
        System.out.println("Insira a 1a nota");
        nota1 = input.nextDouble();
        System.out.println("Insira 2a nota");
        nota2 = input.nextDouble();
        System.out.println("Insira 3a nota");
        nota3 = input.nextDouble();

media = (nota1*0.25)+(nota2*0.35)+(nota3*0.4);
System.out.println("A média é : "+media);


if(media>=9.5){
    System.out.println("Aluno foi aprovado");

}else{
    System.out.println("Aluno nao foi aprovado");

}
    }
}