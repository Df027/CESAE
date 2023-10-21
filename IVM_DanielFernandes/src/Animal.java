import Enums.Alimentacao;

public class Animal extends SerVivo {

    private boolean fome;

    private double peso;

    private double inteligencia;

    private String barulho;

    private Alimentacao alimentacao;

    /**
     * Método construtor para criar/instanciar um animal
     *
     * @param nome         - nome do animal
     * @param especie      - especie do animal
     * @param pais         - pais de origem do animal
     * @param idade        - idade do animal (anos)
     * @param fome         - se tem fome ou nao
     * @param peso         - peso do animal (kg)
     * @param inteligencia - nivel de inteligencia (0-100)
     * @param barulho      - tipo de barulho que faz o animal
     * @param alimentacao  - tipo de alimentaçao
     */

    public Animal(String nome, String especie, String pais, int idade, boolean fome, double peso, double inteligencia, String barulho, Alimentacao alimentacao) throws IllegalArgumentException {
        super(nome, especie, pais, idade);
        if (inteligencia < 0 || inteligencia > 100) {
            throw new IllegalArgumentException("Nivel de inteligencia invalido!");
        }
        this.fome = fome;
        this.peso = peso;
        this.inteligencia = inteligencia;
        this.barulho = barulho;
        this.alimentacao = alimentacao;
    }

    public boolean isFome() {
        return fome;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public String getBarulho() {
        return barulho;
    }

    public void setBarulho(String barulho) {
        this.barulho = barulho;
    }

    public Alimentacao getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(Alimentacao alimentacao) {
        this.alimentacao = alimentacao;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();

    }
}
