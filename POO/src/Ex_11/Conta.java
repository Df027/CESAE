package Ex_11;

public class Conta{
    //Declarar atributos da classe Conta

    private int numero_Conta;

    private double saldo;

    private String titular;

    //Método construtor para inicializar os atributos de uma conta
    public Conta(int numero_Conta, double saldo, String titular) {
        this.numero_Conta = numero_Conta;
        this.saldo = saldo;
        this.titular = titular;
    }

    //Método transferência que tenha como parametros o valor a transferir e a conta de destinatario

    public void transferencia(double valor_transferir, Conta conta_transferencia){
        this.saldo = this.saldo - valor_transferir;
        conta_transferencia.saldo = conta_transferencia.saldo + valor_transferir;
    }

    //Método depositar (aumentar saldo)
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Saldo da conta "+this.numero_Conta+":"+this.saldo);
    }



}
