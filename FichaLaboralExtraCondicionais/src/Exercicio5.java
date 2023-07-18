import java.util.Scanner;
class Exercicio5 {
    public static void main(String[] args) {

        //Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis
        String emote;

        //Ler valores

        System.out.print("Introduza um sorriso");
        emote = input.nextLine();

        switch (emote) {
            case ":)":
            case ":D":

                System.out.println("Ainda bem que está feliz");
                break;

            case ":(":
                System.out.println("Anime-se!");
                break;
            default:
                System.out.println("Tem de introduzir um emote!");
        }
    }
}
