import Enums.Familia;

public class Planta extends SerVivo {

    private Familia familia;
    private int grauDefesa;

    /**
     * Método construtor para instanciar (criar) uma planta
     * @param nome - nome da planta
     * @param especie - especie da planta
     * @param pais - pais de origem da planta
     * @param idade - idade da planta (anos)
     * @param familia - familia da planta
     * @param grauDefesa - grau de defesa (0-5)
     */
    public Planta(String nome, String especie, String pais, int idade, Familia familia, int grauDefesa) throws IllegalArgumentException {
        super(nome, especie, pais, idade);
        if (grauDefesa<0 || grauDefesa>5){
            throw new IllegalArgumentException("Grau de defesa invalido!");
        }
        this.familia = familia;
        this.grauDefesa = grauDefesa;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public int getGrauDefesa() {
        return grauDefesa;
    }

    public void setGrauDefesa(int grauDefesa) {
        this.grauDefesa = grauDefesa;
    }

    // O super abaixo basicamente "importa" o exibirDetalhes criado no SerVivo
    public void exibirDetalhes() {
        super.exibirDetalhes();

    }


}
