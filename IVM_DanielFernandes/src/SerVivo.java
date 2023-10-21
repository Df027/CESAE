public class SerVivo {

    private String nome;

    private String especie;

    private String pais;

    private int idade;

    /**
     * Método construtor para criar/instanciar um ser vivo
     * @param nome - nome do ser
     * @param especie- especie do ser
     * @param pais - pais de origem do ser
     * @param idade - idade do ser (anos)
     */
    public SerVivo(String nome, String especie, String pais, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.pais = pais;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirDetalhes(){
        System.out.println("Nome:"+this.nome);
        System.out.println("Espécie: " +this.especie);
        System.out.println("País de origem: " +this.pais);
        System.out.println("Idade: " +this.idade);
    }
}
