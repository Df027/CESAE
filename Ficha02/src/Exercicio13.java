import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
//Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis
        int horas, minutos;

        //Ler valores do utilizador
        System.out.print("Insira as horas");
        horas = input.nextInt();

        System.out.print("Insira os minutos");
        minutos = input.nextInt();

        if (horas<=12){
            System.out.println(horas+":"+minutos+"AM");
        }else{
            System.out.println((horas-12)+":"+minutos+"PM");
        }

    }
}
