import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {

        // instanciar o Scanner (linha obrigatória para ler dados da consola)

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double valor1, valor2,valor3,media, cinquenta, trinta, vinte;

        System.out.println("Introduza um valor");
        valor1=input.nextDouble();
        System.out.println("Introduza outro valor");
        valor2=input.nextDouble();

        System.out.println("Introduza outro valor");
        valor3=input.nextDouble();

        media=(valor1+valor2+valor3)/3;
    System.out.println("A média é "+media);


        vinte=(media*20)/100;
        System.out.println("20% "+vinte);

        trinta=(media*30)/100;
        System.out.println("30% "+trinta);

        cinquenta=(media*50)/100;
        System.out.println("50% "+cinquenta);

    }
}