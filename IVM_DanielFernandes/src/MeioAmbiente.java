import Enums.Alimentacao;
import Enums.Familia;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class MeioAmbiente {

    private String nome;

    private double agua;

    private ArrayList<SerVivo> seres;

    /**
     * Método construtor para criar instâncias do Meio Ambiente
     *
     * @param nome - nome do Meio Ambiente
     * @param agua - quantidade de água (L)
     */
    public MeioAmbiente(String nome, double agua) {
        this.nome = nome;
        this.agua = agua;
        this.seres = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }

    public ArrayList<SerVivo> getSeres() {
        return seres;
    }

    public void setSeres(ArrayList<SerVivo> seres) {
        this.seres = seres;
    }

    public void adicionarSerVivo(SerVivo ser) {
        this.seres.add(ser);

    }

    /* Boolean plantaBebe(int indexPlanta): analisa a água disponível no meio ambiente e, caso seja
possível, de acordo com a família: árvores bebem 1L, flores bebem 0.1L e ervas bebem 0.25L e
retorna true (a água em meio ambiente deve também diminuir). Se retornar true, então a planta
bebeu e água do meio diminuiu. Se retornar false, a planta não bebe e seca (deve ser retirada do
meio ambiente). */


    //
    public boolean plantaBebe(int indexPlanta) {
        Planta planta = (Planta) this.seres.get(indexPlanta);
        double aguaConsumida = 0;
        if (planta.getFamilia() == Familia.ARVORES) {
            aguaConsumida = 1;
        } else if (planta.getFamilia() == Familia.FLORES) {
            aguaConsumida = 0.1;
        } else if (planta.getFamilia() == Familia.ERVAS) {
            aguaConsumida = 0.25;
        }

        if (this.agua>=aguaConsumida){
            this.agua = this.agua - aguaConsumida;
            System.out.println("A planta bebeu água!");
            return true;
        } else if (this.agua<aguaConsumida){
            System.out.println("A planta não conseguiu beber, pois não há água suficiente. A planta MORREU!");
            this.seres.remove(indexPlanta);
            return false;
        }
        return false;
    }



    public boolean plantaComeInsetos(int indexPlanta){
        Planta planta = (Planta) this.seres.get(indexPlanta);
        boolean existemInsetos = false;
        for (int i = 0; i < this.seres.size(); i++){
            //Se o algum dos indices do array seres for da instancia inseto, existem insetos! (variavel existemInsetos passa a true)
            if(this.seres.get(i)instanceof Inseto){
                existemInsetos = true;
            }
        }

        if (existemInsetos == false){
            System.out.println("Não existem insetos. A planta morreu DE FOME!");
            this.seres.remove(indexPlanta);
            return false;
        } else if (existemInsetos == true) {
            System.out.println("A planta comeu.");
            for (int i = 0; i < this.seres.size(); i++) {
                if (this.seres.get(i) instanceof Inseto) {
                    this.seres.remove(i);
                    System.out.println("O inseto consumido morreu. Coitado!");
                    return true;
                }

            }
        }
        return false;
    }
 /* Boolean plantaComeInsetos(int indexPlanta): a planta come um inseto e retorna true. Caso não
existam insetos, a planta morre de fome, é retirada do meio ambiente e a função retorna false.*/


    /* Void plantaAbanaComVento(int indexPlanta): imprime na consola “Está muito vento”.
• */

    public  void plantaAbanaComVento(int indexPlanta){
        System.out.println("Está muito vento!");
    }

    public void animalFazBarulho(int indexAnimal){
        Animal animal = (Animal) this.seres.get(indexAnimal);
        System.out.println("Barulho do animal:"+animal.getBarulho());

    }

/* • Void animalMovimenta(int indexAnimal): imprime na consola “O (nome do animal) movimentouse”.
  */

    public void animalMovimenta(int indexAnimal){
        SerVivo animal = this.seres.get(indexAnimal);
        System.out.println("O "+animal.getNome()+" movimentou-se!");
    }

/* Boolean animalBebe(int indexAnimal): analisa a água disponível no meio ambiente e, caso seja
possível, de acordo com o seu peso: por cada kg. o animal bebe 0.025L e retorna true (a água em
meio ambiente deve também diminuir).
Se retornar true, então é porque o animal bebeu e água do
meio diminuiu. Se retornar false, o animal não bebe e morre de sede (deve ser retirado do meio
ambiente) */

    public boolean animalBebe(int indexAnimal){
        Animal animal = (Animal) this.seres.get(indexAnimal);
        double pesoDoAnimal = animal.getPeso();
        double aguaConsumida = pesoDoAnimal * 0.025;
        if (this.agua>=aguaConsumida){
            this.agua = this.agua - aguaConsumida;
            System.out.println("O animal bebeu água!");
            return true;
        } else if (this.agua<aguaConsumida){
            System.out.println("O animal não conseguiu beber, pois não há água suficiente. O POBRE animalzinho MORREU! Vida Injusta!");
            this.seres.remove(indexAnimal);
            return false;
        }
        return false;

    }

    /**
     * Método para o animal comer
     * @param indexAnimal
     * @return true se o animal comer, e return false se o animal não comer
     */



    public boolean animalCome(int indexAnimal) {
        Animal animal = (Animal) this.seres.get(indexAnimal);
        if (animal.isFome()) {
            if (animal.getAlimentacao() == Alimentacao.HERBIVORO || animal.getAlimentacao() == Alimentacao.OMNIVORO) {

                //Verificar se no nosso array seres existe uma planta. Começamos por assumir que não há plantas
                boolean plantaFound = false;
                //Percorrer o array seres, para verificar se existe alguma planta. Se houver, plantaFound passa a true
                for (int i = 0; i < this.seres.size(); i++) {
                    if (this.seres.get(i) instanceof Planta) {
                        plantaFound = true;
                    }
                }
                if (!plantaFound){
                    System.out.println("Não existem plantas disponíveis para o animal comer!");
                }

                for (int i = 0; i < this.seres.size(); i++) {
                    if (this.seres.get(i) instanceof Planta) {
                        Planta plantaAtacada = (Planta) this.seres.get(i);
                        if (animal.getInteligencia() <= 19 && plantaAtacada.getGrauDefesa() == 0) {
                            System.out.println("O animal comeu a planta " + plantaAtacada.getNome());
                            System.out.println("A planta morreu. Coitadinha.");
                            animal.setFome(false); //O animal deixou de ter fome


                            //Remover a planta do  array seres / retirar planta do meio ambiente
                            this.seres.remove(i);

                            return true;

                        } else if (animal.getInteligencia() >= 20 && plantaAtacada.getGrauDefesa() <= 1) {
                            System.out.println("O animal comeu a planta " + plantaAtacada.getNome());
                            System.out.println("A planta morreu. Coitadinha.");
                            animal.setFome(false); //O animal deixou de ter fome


                            //Remover a planta do  array seres / retirar planta do meio ambiente
                            this.seres.remove(i);

                            return true;
                        } else if (animal.getInteligencia() >= 40 && plantaAtacada.getGrauDefesa() <= 2) {
                            System.out.println("O animal comeu a planta " + plantaAtacada.getNome());
                            System.out.println("A planta morreu. Coitadinha.");
                            animal.setFome(false); //O animal deixou de ter fome


                            //Remover a planta do  array seres / retirar planta do meio ambiente
                            this.seres.remove(i);

                            return true;

                        } else if (animal.getInteligencia() >= 60 && plantaAtacada.getGrauDefesa() <= 3) {
                            System.out.println("O animal comeu a planta " + plantaAtacada.getNome());
                            System.out.println("A planta morreu. Coitadinha.");
                            animal.setFome(false); //O animal deixou de ter fome


                            //Remover a planta do  array seres / retirar planta do meio ambiente
                            this.seres.remove(i);

                            return true;
                        } else if (animal.getInteligencia() >= 80 && plantaAtacada.getGrauDefesa() <= 4) {
                            System.out.println("O animal comeu a planta " + plantaAtacada.getNome());
                            System.out.println("A planta morreu. Coitadinha.");
                            animal.setFome(false); //O animal deixou de ter fome


                            //Remover a planta do  array seres / retirar planta do meio ambiente
                            this.seres.remove(i);

                            return true;
                        } else if (animal.getInteligencia() >= 95 && plantaAtacada.getGrauDefesa() <= 5) {
                            System.out.println("O animal comeu a planta " + plantaAtacada.getNome());
                            System.out.println("A planta morreu. Coitadinha.");
                            animal.setFome(false); //O animal deixou de ter fome


                            //Remover a planta do  array seres / retirar planta do meio ambiente
                            this.seres.remove(i);


                            //O animal conseguiu comer, return true
                            return true;
                        } else {
                            System.out.println("O animal não conseguiu comer a planta - não é inteligente o suficiente!");
                            return false;
                        }

                    }


                }



            }else if(animal.getAlimentacao() == Alimentacao.CARNIVORO || animal.getAlimentacao() == Alimentacao.OMNIVORO) {
                //Verificar se no nosso array seres existe um animal ou inseto. Começamos por assumir que não há
                boolean animalOrInsectFound = false;
                //Percorrer o array seres, para verificar se existe algum animal ou inseto. Se houver, animalOrInsectFound passa a true
                for (int i = 0; i < this.seres.size(); i++) {
                    if ((this.seres.get(i) instanceof Animal || this.seres.get(i) instanceof Inseto) && indexAnimal!= i) {
                        animalOrInsectFound = true;
                    }
                }
                if (!animalOrInsectFound){
                    System.out.println("Não existem animais ou insetos disponíveis para o animal comer!");
                }


                for (int i = 0; i < this.seres.size(); i++) {

                    // Se o ser vivo é da instancia Animal, e o animal não é ele próprio
                    // (ou seja se o index animal for diferente do i)
                    if(this.seres.get(i) instanceof Animal && indexAnimal!= i){
                        // Casting
                        Animal animalAtacado = (Animal) this.seres.get(i);
                        double indiceCapacidadePredador = (1*animal.getPeso())+(2.5*animal.getInteligencia());
                        double indiceCapacidadePresa = (1*animalAtacado.getPeso())+(2.5*animalAtacado.getInteligencia());

                        if(indiceCapacidadePredador>indiceCapacidadePresa){
                            System.out.println("O animal conseguiu comer o "+animalAtacado.getNome());
                            System.out.println("O "+animalAtacado.getNome()+" morreu!");
                            animal.setFome(false); //O animal deixou de ter fome

                            //Remover o animal do  array seres / retirar animal do meio ambiente
                            this.seres.remove(i);

                            //O animal conseguiu comer, return true
                            return true;

                        }else if(indiceCapacidadePredador<=indiceCapacidadePresa){
                            System.out.println("O animal não conseguiu comer. Não é forte o suficiente!");
                            System.out.println("Presa: "+animalAtacado.getNome());
                            System.out.println("Predador: "+animal.getNome());

                            //O animal não conseguiu comer, return false
                            return false;
                        }


                    }else if(this.seres.get(i) instanceof Inseto){
                        //Casting
                        Inseto insetoAtacado = (Inseto) this.seres.get(i);
                        //Se o inseto nao for venenoso
                        if (!insetoAtacado.isVenenoso()){
                            System.out.println("O animal conseguiu comer o "+insetoAtacado.getNome());
                            System.out.println("O "+insetoAtacado.getNome()+" morreu!");

                            animal.setFome(false); //O animal deixou de ter fome

                            //Remover o inseto do  array seres / retirar inseto do meio ambiente
                            this.seres.remove(i);

                            //O animal conseguiu comer, return true
                            return true;

                        }else if(insetoAtacado.isVenenoso()){
                            System.out.println("O inseto é venenoso. O " +animal.getNome()+ " morreu!");

                            //Remover o animal do array seres / retirar animal do meio ambiente
                            this.seres.remove(animal);
                            //Return false porque nao conseguiu comer
                            return false;
                        }
                    }
                }
            }
            /*  Se estiver a comer um inseto: se for venenoso o animal morre, é retirado do meio
ambiente e o método retorna false. Se não for venenoso então o animal come, a
fome passa a false e o método retorna true. */




            // !animal.isFome = animal.isFome == false
        }else if (!animal.isFome()) {
            System.out.println("O animal está de barriga cheia!");
        }
        return false;
    }
    /*  • Boolean animalCome(int indexAnimal):
o Um animal só irá comer se fome estiver true (se o animal tiver fome), caso contrário deve
apresentar a mensagem “O animal está de barriga cheia”.
o Se o animal for carnívoro: irá comer outro animal ou inseto
o Se o animal for herbívoro: irá comer uma planta
o Se o animal for omnívoro: irá comer qualquer ser vivo.
o Para avaliar se o animal pode comer outro ser vivo temos de ter em conta diversos
parâmetros */





    /**
     * Método para inseto chatear
     */
    public void insetoChateia(){
        int barulho = (int) (Math.random()*3+1);
        if (barulho == 1){
            System.out.println("Bzzzz bzzzz");
        } else if (barulho == 2){
            System.out.println("Tic tic tic tic");

        } else if (barulho == 3){
            System.out.println("Pssssssss");
        }

    }


        //Tem como parâmetro o número de dias que queremos simular no meio ambiente. Meio o qual terá
    //seres vivos de vários tipos adicionados.
    //• Este método deve ter uma variável: acontecimento que será um Random de 1 até 4.
    //o Esta variável deve escolher qual a classe de SerVivo que irá ter um comportamento:
    // 1: Uma planta irá ter uma ação.
    // 2: Um animal irá ter uma ação.
    // 3: Um inseto irá ter uma ação.
    // 4: Catástrofe natural.
    //• Seguidamente, após ter escolhido uma classe de ser vivo para ter uma ação, deve verificar todos os
    //animais existentes no meio dessa determinada classe e guardar os seus índices num novo array
    //auxiliar. (usar ArrayList para facilitar imenso)
    //• Posteriormente, seleciona novamente de forma aleatória qual o ser vivo que terá uma ação e
    //executa uma das ações desse ser vivo. Se for:
    //o Planta: deve escolher aleatoriamente se invoca plantaAbanaComVento( ), plantaBebe( ) ou
    //plantaComeInseto( ) (para o caso de ser planta come insetos).
    //o Animal: deve escolher aleatoriamente se invoca animalFazBarulho( ), animalMovimenta( ),
    //animalBebe( ) ou animalCome( ).
    //o Inseto: deve invocar insetoChateia( ).

    public void simulador(int numDias){
        ArrayList<Integer> indicesPlantas = new ArrayList<>();
        ArrayList<Integer> indicesAnimais = new ArrayList<>();
        ArrayList<Integer> indicesInsetos = new ArrayList<>();

        for(int i=0;i< this.seres.size();i++){
            if (this.seres.get(i) instanceof Planta){
                indicesPlantas.add(i);
            }else if (this.seres.get(i) instanceof Animal) {
                indicesAnimais.add(i);
            }else if(this.seres.get(i) instanceof Inseto) {
                indicesInsetos.add(i);
            }
        }

        int acontecimento = (int) (Math.random()*4+1);
        //Se for uma planta
        if (acontecimento == 1) {
            //Para escolher uma planta aleatória com base no seu indice aleatório
            int plantaAleatoria = indicesPlantas.get((int) (Math.random()*indicesPlantas.size()));
            int acaoPlanta = (int) (Math.random()*3+1);
            if (acaoPlanta == 1){
                System.out.println("A planta vai abanar com o vento!");
                plantaAbanaComVento(plantaAleatoria);
            }else if(acaoPlanta == 2){
                System.out.println("A planta vai tentar beber água!");
                plantaBebe(plantaAleatoria);
            }else if(acaoPlanta == 3){
                System.out.println("A planta vai tentar comer um inseto!");
                Planta planta = (Planta) this.seres.get(plantaAleatoria);
                if (planta.getFamilia()== Familia.COMEINSETOS){
                    plantaComeInsetos(plantaAleatoria);
                }else{
                    System.out.println("A planta não é da familia come insetos, por isso não comeu nenhum.");
                }
            }

            //Se for um animal
        }else if(acontecimento == 2){
            System.out.println("Foi escolhido um animal para fazer uma ação.");

            //Para escolher um animal aleatório com base no seu indice aleatório
            int animalAleatorio = indicesAnimais.get((int) (Math.random()*indicesAnimais.size()));
            int acaoAnimal = (int) (Math.random()*4+1);
            if (acaoAnimal == 1){
                System.out.println("O animal vai fazer barulho!");
                animalFazBarulho(animalAleatorio);
            }else if(acaoAnimal == 2){
                System.out.println("O animal vai movimentar-se!");
                animalMovimenta(animalAleatorio);
            }else if(acaoAnimal == 3){
                System.out.println("O animal vai tentar beber água!");
                animalBebe(animalAleatorio);
            }else if(acaoAnimal == 4){
                System.out.println("O animal vai tentar comer!");
                animalCome(animalAleatorio);
            }



            //Se for um inseto
        }else if(acontecimento == 3){
            //Para escolher um inseto aleatório com base no seu indice aleatório
            int insetoAleatorio = indicesInsetos.get((int) (Math.random()*indicesInsetos.size()));
            SerVivo inseto = this.seres.get(insetoAleatorio);
            System.out.println("O inseto "+inseto.getNome()+" vai fazer barulho!");
            insetoChateia();

        //Se for uma catástrofe natural
        }else if(acontecimento == 4){
            //Para escolher uma catástrofe aleatória com base num número aletorio de 1 a 3
            int catastrofeAleatoria = (int) (Math.random()*3+1);
            //Na 1º catastrofe (seca), a água diminui para metade
            if (catastrofeAleatoria == 1){
                System.out.println("Seca extrema! A água diminuiu para metade.");
                this.agua /= 2;
            //Na 2º catastrofe (cheias) a água aumenta para o dobro
            }else if(catastrofeAleatoria == 2){
                System.out.println("Dilúvio! A água aumentou para o dobro.");
                this.agua *=2;
            }else if(catastrofeAleatoria ==3){
            //Percorre metade do array indicesAnimais ( /2)
                System.out.println("Erupção vulcânica!Morreram metade dos animais e plantas!");
                for(int i=0;i< indicesAnimais.size()/2;i++){
                    //Remove metade dos animais
                    this.seres.remove(i);
                }for(int i=0;i< indicesPlantas.size()/2;i++) {
                    //Remove metade das plantas
                    this.seres.remove(i);
                }
            }

        }

}


    public void exibirDetalhes() {
        System.out.println("Nome:" + this.nome);
        System.out.println("Agua disponivel:" + this.agua);
        System.out.println("\nLista de seres vivos:");
        for (int i = 0; i < this.seres.size(); i++) {
            System.out.println("Índice: "+i);
            this.seres.get(i).exibirDetalhes();
            System.out.println();
        }
    }
}

