import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
//Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis
    int num;
        //Ler valores do utilizador
        System.out.print("Insira um numero: ");
        num=input.nextInt();

        if (num%2==0)

        {
            System.out.println("O numero"+num+" é par");
        }
        else {
            System.out.println("O numero"+num+" é impar");
        }
        ;

    }
}
