package Ex_11;

public class Main {
    public static void main(String[] args) {

        Conta contaDaniel = new Conta(1234, 250, "Daniel");
        Conta contaBruna = new Conta(444, 100, "Bruna");
        contaDaniel.depositar(50);
        contaDaniel.transferencia();

    }
    }
