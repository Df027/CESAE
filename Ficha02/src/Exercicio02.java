import java.util.Scanner;
class Exercicio02 {
    public static void main(String[] args) {

        //Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);


        //Declarar as variaveis8

        int salario;

        //Ler valores do utilizador

        System.out.print("Insira salario: ");
        salario=input.nextInt();

        if (salario<=15000){
            System.out.println("Imposto: " + salario*0.2);

        }else{
            System.out.println("Imposto:"+salario*0.3);
        }

    }



}
      