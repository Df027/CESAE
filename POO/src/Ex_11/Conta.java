package Ex_11;

import java.sql.SQLOutput;

public class Conta {

    private String numero_Conta;

    private double saldo=0;

    private String titular;

    /** Método Construtor para uma Conta
     * numero_Conta . IBAN (Numero da conta)
     * titular - Nome do Titular da Conta
     *
     * **/
    public Conta(String numero_Conta, String titular){
        this.numero_Conta = numero_Conta;
        this.titular = titular;
    }

    /** Método para Depositar Dinheiro na Conta
     * valor - Valor a Depositar **/
    public void depositar(double valor){
        this.saldo+=valor;
        System.out.println("Deposito efetuado");
    }
    // Método para levantar dinheiro da conta
    public void levantar(double valor){
        if(this.saldo>=valor){
            //Caso possa levantar
            this.saldo-=valor;
            System.out.println("Levantamento Efetuado");

        }else{
            //Caso não tenha saldo suficiente
            System.out.println("Levantamento recusao, saldo insuficiente");
        }
    }
// Metodo para transferir dinheiro de uma conta para outra

    public void transferir(Conta contaDestino, double valor){
        if(this.saldo>=valor){
            //Caso a transferencia seja valida
            this.saldo-=saldo;
            contaDestino.depositar(valor);
        }else{
            //Caso a transferencia invalida, saldo insuficiente
            System.out.println("Transf. recusada, saldo insuficiente");
        }
    }
    public void verDetalhes(){
        System.out.println("Numero da conta"+this.numero_Conta);
        System.out.println("Titular"+this.titular);
        System.out.println("Saldo atual"+this.saldo);
    }
}
