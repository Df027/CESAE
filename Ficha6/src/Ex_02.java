import java.util.Scanner;
public class Ex_02 {
    static int maiorNumero(int num1, int num2) {
        if (num1 < num2) {
            return num2;
        }
        if (num1 > num2) {
            return num1;
        }
    }

    /**
     * Fu
     * @param num
     * @return
     */
    static int somar5 (int num){
        return num+5;
    }

    public static void main (String[] args){
        //Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int num1, num2 ,maior;

        System.out.println("Introduza o numero : ");
        num1=input.nextInt();

        System.out.println("Introduza o numero : ");
        num1=input.nextInt();

      maior = maiorNumero(num1,num2);

      System.out.println("Maior: "+maior);
    }


}
