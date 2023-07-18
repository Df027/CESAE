package Ficha4;

import java.util.Scanner;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        String opcao;


        do { //Este do inicia o menu
            do { //Imprime opçoes do Menu
                System.out.println("Menu 1.Criar. 2.Atualizar. 3.Eliminar. 4.Sair");

                //Recolher escolha do utilizador
                System.out.println("Escolha uma opção");
                opcao = input.next();


                switch (opcao) {
                    case "1":
                        System.out.println("Criar");
                        break;

                    case "2":
                        System.out.println("Atualizar");
                        break;

                    case "3":
                        System.out.println("Eliminar");
                        break;

                    case "4":
                        break;

                    default:
                        System.out.println("Inválida");

                }
            }while(!opcao.equals("4"));




            } while (!opcao.equals("4")); //Quando a escolha for 4, não apresenta o menu

    }
}