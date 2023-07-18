import java.util.Scanner;
class Exercicio4 {
    public static void main(String[] args) {

        //Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis8
        String letra;

        //Ler valores do utilizador

        System.out.print("Introduza uma letra");
        letra = input.nextLine();

        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
        System.out.println("A letra que inseriu é uma vogal");
                break;

            default:
                System.out.println("A letra que inseriu é uma consoante");
                break;

        }
    }
}
