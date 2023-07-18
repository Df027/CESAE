import java.util.Scanner;
class Exercicio6 {
    public static void main(String[] args) {

        //Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis
        String cor;

        //Ler valores

        System.out.print("Introduza a cor dos seus olhos");
        cor = input.nextLine();

        switch (cor) {
            case "castanho":
            case "verde":
            case "azul":

                System.out.println("Pareces ser humano!");
                break;


            default:
                System.out.println("Cuidado, podes ser um alien!");
        }
    }
}