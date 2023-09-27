package Ex_10;

public class Funcionario {

    //Declarar atributos da class Funcionario
    private String nome;
    private double salario;
    private String departamento;

    //Método construtor para inicializar os atributos do Funcionario
    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }
    //Método para Aumentar salário
    // O salário vai ser o salário + salário * valor (este valor vai ser um parâmetro que lhe vamos dar no main)
    public void aumentarSalario(double valor){

        this.salario = this.salario +  this.salario * valor ;
        System.out.println("O salário após o aumento é de:"+salario);
    }
    //Método para exibir dados do Funcionario
public void exibirDados(){
    System.out.println("Nome:"+nome);
    System.out.println("Salário:"+salario);
    System.out.println("Nome:"+departamento);
}
}
