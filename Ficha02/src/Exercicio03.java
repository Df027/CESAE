import java.util.Scanner;
class Exercicio3 {
    public static void main(String[] args) {

        //Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variaveis8

        int salario;

        //Ler valores do utilizador

        System.out.print("Insira salario: ");
        salario=input.nextInt();

        if (salario<=15000){
            System.out.println("Montante de impostos a pagar é/Imposto 20%: " + salario*0.2);
        }

        // else if

        if (salario >=15000 && salario <=20000){
            System.out.println("Montante de impostos a pagar é/Imposto 30%:"+salario*0.3);
        }


        if (salario >=20000 && salario <=25000){
            System.out.println("Montante de impostos a pagar é/Imposto 35%:"+salario*0.35);
        }

        if (salario > 25000){
            System.out.println("Montante de impostos a pagar é/Imposto 40%:"+salario*0.4);
        }

    }

}
