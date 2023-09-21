package Ex_02;

public class Cao {
    private String nome;

    private String raca;

    private String ladrar="Au au au";

    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome(){ return this.nome;}

    public String getRaca(){ return this.raca;}

    public String getLadrar(){ return this.ladrar; }


    public void setLadrar(String ladrar) {
        this.ladrar = ladrar;
    }

    void bark(){
        System.out.print(ladrar);
    }
}
