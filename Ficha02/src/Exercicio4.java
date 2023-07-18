import java.util.Scanner;
class Exercicio4 {
    public static void main(String[] args) {

        //Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis8

        int lugar;


        //Ler valores do utilizador

        System.out.print("Insira lugar em que ficou colocado: ");
        lugar=input.nextInt();

        if (lugar==1){
            System.out.println("Ficou em "+lugar+"lugar! Ganhou 10 pontos");
        }

        if (lugar==2){
            System.out.println("Ganhou 8 pontos");
        }


        if (lugar==3){
            System.out.println("Ganhou 6 pontos");
        }

        if (lugar==4){
            System.out.println("Ganhou 5 pontos");
        }
        if (lugar==5){
            System.out.println("Ganhou 4 pontos" );
        }
        if (lugar==6){
            System.out.println("Ganhou 3 pontos" );
        }
        if (lugar==7){
            System.out.println("Ganhou 2 pontos" );
        }
        if (lugar==8){
            System.out.println("Ganhou 1 pontos" );
        }

        if (lugar>8){
            System.out.println("Não ganhou nenhum ponto");
        }

    }

}

