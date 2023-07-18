import java.util.Scanner;
class Exercicio5 {
    public static void main(String[] args) {

        //Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis

        int num1,num2;

        //Ler valores do utilizador
        System.out.print("Insira um numero: ");
        num1=input.nextInt();

        System.out.print("Insira outro numero: ");
        num2=input.nextInt();

        //Comparar num 1 com num2

        if (num1<num2){
            System.out.println(num1+" "+num2);
        }
        else {
            System.out.println(num2+" "+num1);
        }
    }
}