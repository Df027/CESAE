import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
//Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis
        int num1, num2, num3;

//Ler valores do utilizador
        System.out.print("Insira o primeiro numero");
        num1 = input.nextInt();

        System.out.print("Insira o segundo numero");
        num2 = input.nextInt();

        System.out.print("Insira o terceiro numero");
        num3 = input.nextInt();

        if (num1 < num2 && num1 < num3) {
            if (num2 < num3) {
                System.out.printf(num1 + " " + num2 + " " + num3);
            } else {
                System.out.printf(num1 + " " + num3 + " " + num2);

                if (num2 < num1 && num2 < num3) {
                    if (num1 < num2)
                        System.out.printf(num2 + "" + num1 + "" + num3);
                } else {
                    System.out.printf(num2 + "" + num3 + "" + num1);


                    if (num3 < num1 && num3 < num2) {
                        if (num1 < num3)
                            System.out.printf(num3 + "" + num1 + "" + num2);
                    } else {
                        System.out.printf(num3 + "" + num2 + "" + num1);

                    }
                }


            }

        }


    }
}
