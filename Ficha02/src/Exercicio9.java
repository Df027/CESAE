import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
//Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis
        int num1,num2,num3;

        //Ler valores do utilizador
        System.out.print("Insira o primeiro numero: ");
        num1=input.nextInt();

        System.out.print("Insira o segundo numero: ");
        num2=input.nextInt();

        System.out.print("Insira o terceiro numero: ");
        num3=input.nextInt();

        if(num1<num2 && num1<num3)
        System.out.println("O numero menor é "+num1);

        if(num2<num1 && num2<num3)
        System.out.println("O numero menor é "+num2);

        if (num3<num1 && num3<num2)
        System.out.println("O numero menor é "+num3);




    }
}
