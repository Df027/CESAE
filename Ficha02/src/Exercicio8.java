import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
//Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis
        double nota1,nota2,nota3,media;
        //Ler valores do utilizador
        System.out.print("Insira a nota 1(0-20): ");
        nota1=input.nextDouble();

        System.out.print("Insira a nota 2(0-20): ");
        nota2=input.nextDouble();

        System.out.print("Insira a nota 3(0-20): ");
        nota3=input.nextDouble();


        //Calculo da media e apresentaçao da media do utilizador

        media=(nota1*0.25)+(nota2*0.35)+(nota3*0.40);
        System.out.println("A sua média é: "+media);

        //Mostrar se foi aprovado ou nao

     if (media>=9.5)
         System.out.println("Foi aprovado!");
     else{
         System.out.println("Não foi aprovado!");
     }

    }
}
