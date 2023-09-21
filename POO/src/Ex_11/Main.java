package Ex_11;

public class Main {
    public static void main(String[] args) {
        //Instanciar uma conta

        Conta conta1 = new Conta("12345","Vitor");
        Conta conta2 = new Conta("67890","Primo da Suiça");

        conta1.verDetalhes();

       //Depositar

       conta1.depositar(500);

       conta1.verDetalhes();

       conta1.levantar(750);

       conta1.verDetalhes();

       conta1.levantar(40);

       conta1.verDetalhes();

        //Transferir invalido
        conta1.transferir(conta2,1000);

        conta1.verDetalhes();
        conta2.verDetalhes();

       //Transferir valido
        conta1.transferir(conta2,110);

        conta1.verDetalhes();
        conta2.verDetalhes();


    }
}
