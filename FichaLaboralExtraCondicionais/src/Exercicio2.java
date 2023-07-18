import java.util.Scanner;
class Exercicio2 {
    public static void main(String[] args) {

        //Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis8

        double peso, pesoLua;

        //Ler valores do utilizador

        System.out.print("Insira o seu peso");
        peso = input.nextDouble();

        if (peso >0) {
            pesoLua=peso*0.16;
            System.out.print("O seu peso na Lua seria de "+pesoLua);
        }else {
            System.out.println("Peso tem de ser maior que 0");
        }
}
    }


