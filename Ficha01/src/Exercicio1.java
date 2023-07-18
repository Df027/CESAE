import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {

        // instanciar o Scanner (linha obrigatória para ler dados da consola)

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int x, y, resultado;

        //Ler input utilizador
    System.out.print("Introduza um numero");
    x=input.nextInt();
    System.out.print("Introduza outro numero");
        y=input.nextInt();

resultado=x+y;
    System.out.println("Resultado:"+resultado);
    }
}