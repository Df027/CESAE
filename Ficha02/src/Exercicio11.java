import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
//Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis
        double saldo, montante;

        //Ler os valores do utilizador
        System.out.print("Insira o saldo:");
        saldo = input.nextDouble();

        System.out.print("Insira o montante a creditar (+) ou debitar (-)");
        montante = input.nextDouble();

        saldo = saldo + montante;

        if (saldo>=0) {
            System.out.println("O seu saldo é positivo" + saldo);

        }else{
            System.out.println("O seu saldo é negativo"+saldo);
        }


        }
    }
