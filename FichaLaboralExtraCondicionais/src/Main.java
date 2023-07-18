import java.util.Scanner;
class Exercicio1 {
    public static void main(String[] args) {

        //Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis

        int x;

        //Ler valores do utilizador

        System.out.print("Insira a sua idade ");
        x = input.nextInt();

        if (x >= 18) {
            System.out.println("O utilizador tem " + x + " anos. É maior de idade.");
        }
            else
                System.out.println("O utilizador tem "+x+" anos. Não é maior de idade.");
        }
    }

