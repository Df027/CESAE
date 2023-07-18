import java.util.Scanner;
public class Ex_01 {


    /**
     * A funçao imprime o barulho de um animal
     * @param animal - Animal que vai fazer baruho
     */
   static void fazerBarulho(String animal){
        switch(animal){
            case "CAO":
                System.out.println("Au au au!");
                break;

            case "GATO":
                System.out.println("MIAU");
                break;

            case "PEIXE":
                System.out.println("Glubglubglub");
                break;

            case "VACA":
                System.out.println("MUUU");
                break;

            case "PORCO":
                System.out.println("oink oink");
                break;

            default:
                System.out.println("Barulho indefinido");
                break;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String animalEscolhido;

        System.out.println("Escolha um animal: ");
        animalEscolhido=input.next();

        fazerBarulho(animalEscolhido);

        System.out.println("\nFim!");
   }
}
