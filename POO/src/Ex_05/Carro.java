package Ex_05;

public class Carro {
    private String marca;

    private String modelo;

    private int anoFabrico;

    public Carro(String marca, String modelo, int anoFabrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
    }

    public String getmarca(){ return this.marca;}

    public String getmodelo(){ return this.modelo;}

    public int getanoFabrico(){ return this.anoFabrico; }


    void ligar(){
        System.out.print("O carro está ligado");
    }

}
