import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {

        // instanciar o Scanner (linha obrigatória para ler dados da consola)

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double largura, comprimento,perimetro, area;

        System.out.println("Introduza a largura");
        largura=input.nextDouble();
        System.out.println("Introduza o comprimento");
        comprimento=input.nextDouble();

        perimetro=(largura*2)+(comprimento*2);
        System.out.println("O perimetro é "+perimetro);

        area=(largura*comprimento);
        System.out.println("A area é "+area);
    }
}