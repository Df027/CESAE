import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
//Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis
        int operacao;

        //Ler valores do utilizador
        System.out.print("Escolha uma opção 1)Criar, 2)Atualizar, 3)Eliminar, 4)Sair: ");
        operacao=input.nextInt();

        //Escolher um caso dependendo da operaçao escolhida pelo utilizador

switch(operacao){
    case 1:
        System.out.println("Criar");
        break;

    case 2:
        System.out.println("Atualizar");
        break;

    case 3:
        System.out.println("Eliminar");
        break;

    case 4:
        break;

    default:
        System.out.println("Erro, operacao invalida");
        break;
}

            }
        }


