public class Inseto extends SerVivo {

    private boolean venenoso;

    /**
     * Método construtor para instanciar o Inseto
     * @param nome - nome do inseto
     * @param especie - especie do inseto
     * @param pais - pais do inseto
     * @param idade - idade do inseto (anos)
     * @param venenoso - se é venenoso ou não
     */

    public Inseto(String nome, String especie, String pais, int idade, boolean venenoso) {
        super(nome, especie, pais, idade);
        this.venenoso = venenoso;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();

    }
}
