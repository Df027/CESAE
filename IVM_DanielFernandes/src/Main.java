import Enums.Alimentacao;
import Enums.Familia;

public class Main {
    public static void main(String[] args) {

        // Criar um meio ambiente, uma planta, animal e inseto
        MeioAmbiente deserto = new MeioAmbiente("Sahara",100);
        Planta cato = new Planta("aloe","cactus","Mexico",3, Familia.ARVORES,5);
        Animal cao = new Animal("Labrador","K9","USA",5,true, 60.5,95, "woof", Alimentacao.CARNIVORO);
        Animal elefante = new Animal("Elefante","Elef","USA",5,true, 600,95, "woof", Alimentacao.CARNIVORO);
        Inseto aranha = new Inseto("Tarantula","Tarantulis","Australia",5, true);
        Animal animal21 = new Animal("Tigre", "Tigre-de-Bengala", "Índia", 10, true, 300, 100,"Roar!" ,Alimentacao.CARNIVORO );
        Animal animal22 = new Animal("Urso", "Urso Pardo", "Canadá", 15, true, 600, 90, "Grrr!", Alimentacao.OMNIVORO);
        Animal animal23 = new Animal("Panda", "Panda Gigante", "China", 8, true, 150, 60, "Nom-nom!", Alimentacao.HERBIVORO );
        Animal animal24 = new Animal("Canguru", "Canguru Vermelho", "Austrália", 6, true, 70, 80, "Boing!", Alimentacao.HERBIVORO);
        Animal animal25 = new Animal("Lobo", "Lobo Cinzento", "Canadá", 7, true, 120, 70, "Howl!", Alimentacao.CARNIVORO );
        Animal animal19 = new Animal("Toucan", "Tucano", "Brasil", 8, false, 30, 75, "Squawk!", Alimentacao.OMNIVORO );
        Animal animal20 = new Animal("Banana", "Macaco Mandril", "Quénia", 40, false, 75, 90, "Hoo-ha!", Alimentacao.OMNIVORO);
        Inseto insecto9 = new Inseto("Louva-a-Deus", "Louva-a-Deus", "Brasil", 3, true);
        Inseto insecto10 = new Inseto("Besouro do Rinoceronte", "Besouro", "África do Sul", 1, false);
        Inseto insecto11 = new Inseto("Gorgulho", "Besouro", "EUA", 1, false);
        Inseto insecto12 = new Inseto("Libélula Azul", "Libélula", "França", 4, false);
        Inseto insecto13 = new Inseto("Formiga de Fogo", "Formiga", "Austrália", 1, true);
        Inseto insecto14 = new Inseto("Mosquito", "Mosquito", "Brasil", 1, true);
        Inseto insecto15 = new Inseto("Joaninha de Sete Pontos", "Joaninha", "Espanha", 2, false);
        Inseto insecto16 = new Inseto("Besouro", "Besouro", "África do Sul", 1, false);
        Planta planta10 = new Planta("Eucalipto", "Árvore", "Austrália", 10, Familia.ARVORES, 4);
        Planta planta11 = new Planta("Bambu", "Árvore", "China", 5,Familia.ARVORES, 3);
        Planta planta12 = new Planta("Rosa Vermelha", "Flor", "França", 2, Familia.FLORES, 3);
        Planta planta13 = new Planta("Samambaia", "Folhagem", "Brasil", 4, Familia.COMEINSETOS, 2);
        Planta planta14 = new Planta("Orquídea", "Flor", "Tailândia", 3, Familia.FLORES, 4);
        Planta planta15 = new Planta("Palmeira", "Árvore", "Brasil", 15, Familia.ARVORES, 3);
        Planta planta16 = new Planta("Tulipa", "Flor", "Holanda", 1,  Familia.FLORES, 2);

        //Adicionar ser vivos ao meio ambiente, neste caso um cato
        deserto.adicionarSerVivo(cato);
        deserto.adicionarSerVivo(cao);
        deserto.adicionarSerVivo(elefante);
        deserto.adicionarSerVivo(aranha);
        deserto.adicionarSerVivo(animal21);
        deserto.adicionarSerVivo(animal22);
        deserto.adicionarSerVivo(animal23);
        deserto.adicionarSerVivo(animal24);
        deserto.adicionarSerVivo(animal25);
        deserto.adicionarSerVivo(animal19);
        deserto.adicionarSerVivo(animal20);
        deserto.adicionarSerVivo(insecto9);
        deserto.adicionarSerVivo(insecto10);
        deserto.adicionarSerVivo(insecto11);
        deserto.adicionarSerVivo(insecto12);
        deserto.adicionarSerVivo(insecto13);
        deserto.adicionarSerVivo(insecto14);
        deserto.adicionarSerVivo(insecto15);
        deserto.adicionarSerVivo(insecto16);
        deserto.adicionarSerVivo(planta10);
        deserto.adicionarSerVivo(planta11);
        deserto.adicionarSerVivo(planta12);
        deserto.adicionarSerVivo(planta13);
        deserto.adicionarSerVivo(planta14);
        deserto.adicionarSerVivo(planta15);
        deserto.adicionarSerVivo(planta16);

        deserto.simulador(2);


    }
}
