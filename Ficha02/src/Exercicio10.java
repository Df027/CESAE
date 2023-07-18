import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
//Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis
    double num1,num2, resultado;
    String operacao;

        //Ler valores do utilizador
        System.out.print("Insira o primeiro numero: ");
        num1=input.nextDouble();

        System.out.print("Insira o segundo numero: ");
        num2=input.nextDouble();

        System.out.print("Insira operação aritmética que pretende executar(+)(-)(/)(*) ");
        operacao=input.next();

//Escolher um caso dependendo da operaçao escolhida pelo utilizador
       switch (operacao) {
           case "+": // if(operacao == "+")
               resultado = num1 + num2;
               System.out.println("Soma:" + resultado);
               break;

           case "-": // if (operacao == "-")
            resultado = num1 - num2;
            System.out.println("Subtracao:"+resultado);
            break;

           case "/":
               resultado = num1/num2;
               System.out.println("Divisao:"+resultado);
               break;

           case "*":
               resultado = num1*num2;
               System.out.println("Multiplicacao:"+resultado);
               break;


           default:
               System.out.println("Erro, operacao invalida");
               break;

       }

        }


    }
