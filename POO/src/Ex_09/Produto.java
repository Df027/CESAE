package Ex_09;
//Criar a class Produto
public class Produto {

//Declarar atributos
    private String nome;

    private double preco;

    private int stock = 0;

    //Método construtor para inicializar os atributos
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;

    }
    //stock = stock + quantidade

    //Uma funçao void nao tem de retornar nada. Não é necessario usar return. Por ex. em menus, queremos apenas mostrar o menu e não retornar um resultado


    //Quando tu determina o tipo que a funçao terá(string, wtv), tem de retornar algo do mesmo tipo
    public String comprar(int quantidade){
        this.stock += quantidade;
return ("Nice! Comprado");
}
public  String vender(int quantidade){

        if(quantidade>stock){
            return ("Transação nao e possivel. Quebra de stock!");
        }else{
            this.stock -= quantidade;
            return ("Stock disponivel é "+stock);
        }

}


//Apesar do atributo stock ser private, ao utilizar um método get podemos aceder ao stock
    public int getStock() {
        return stock;
    }
}



