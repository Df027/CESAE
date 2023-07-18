import java.util.Scanner;
class Exercicio8 {
    public static void main(String[] args) {

        //Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis
        int ano;

        //Ler valores

        System.out.print("Introduza um ano");
        ano = input.nextInt();

        if (ano % 4 == 0)

            System.out.println("O ano " + ano + " é bissexto");
        else
            System.out.println("O ano " + ano + "não é bissexto");

    }
}