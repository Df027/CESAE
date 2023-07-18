import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {

        // instanciar o Scanner (linha obrigatória para ler dados da consola)

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int valor1, valor2, resultado;

        System.out.println("Introduza um valor");
        valor1=input.nextInt();
        System.out.println("Introduza outro valor");
        valor2=input.nextInt();

        resultado=valor1+valor2;
        System.out.println("O resultado é"+resultado);

        resultado=valor1-valor2;
        System.out.println("O resultado é"+resultado);

        resultado=valor1/valor2;
        System.out.println("O resultado é"+resultado);

        resultado=valor1*valor2;
        System.out.println("O resultado é"+resultado);

    }
}
