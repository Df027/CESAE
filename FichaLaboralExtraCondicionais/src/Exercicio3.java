import java.util.Scanner;
class Exercicio3 {
    public static void main(String[] args) {

        //Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis8
    double valor, desconto, precofinal;

        //Ler valores do utilizador

        System.out.print("Insira o valor do produto");
        valor = input.nextInt();

        desconto=valor*0.1;
        precofinal=valor-desconto;

        if (valor>=100){
            System.out.println("Obteve um desconto de 10%. O valor a pagar é de "+precofinal);


        }

    }
}