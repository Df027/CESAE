import java.util.Scanner;
class Exercicio7 {
    public static void main(String[] args) {

        //Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis
        int num;

        //Ler valores

        System.out.println("Adivinhe o numero misterioso!");
        num=input.nextInt();

        if(num==20){
            System.out.println("Acertou!");
        }else {
            if (num < 20) {
                System.out.println("O numero misterioso é maior!");
            } else {
                System.out.println("O numero misterioso é menor");
            }


            System.out.print("Tente novamente: ");
            num = input.nextInt();

            if (num == 20) {
                System.out.println("Acertou!");
            } else {
                if (num < 20) {
                    System.out.println("O numero misterioso é maior!");
                } else {
                    System.out.println("O numero misterioso é menor");
                }
                System.out.println("Esgotou as tentativas...");
            }
        }
    }
}