import Enums.Alimentacao;
import Enums.Familia;

public class Main {
    public static void main(String[] args) {

        // Criar um meio ambiente, uma planta, animal e inseto
        MeioAmbiente deserto = new MeioAmbiente("Sahara",0);
        Planta cato = new Planta("aloe","cactus","Mexico",3, Familia.ARVORES,5);
        Animal cao = new Animal("Labrador","K9","USA",5,true, 60.5,100, "woof", Alimentacao.OMNIVORO);
        Inseto aranha = new Inseto("Tarantula","Tarantulis","Australia",5, true);


        //Adicionar ser vivos ao meio ambiente, neste caso um cato
        deserto.adicionarSerVivo(cato);
        deserto.adicionarSerVivo(cao);
        deserto.adicionarSerVivo(aranha);

        deserto.insetoChateia();

    }
}