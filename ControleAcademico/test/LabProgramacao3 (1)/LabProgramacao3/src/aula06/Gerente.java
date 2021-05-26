package aula06;

public class Gerente extends Funcionario{

    public Gerente() {
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String getNome() {
        return super.nome.toUpperCase() + " (GERENTE)";
    }

    @Override
    public double getSalario() {
        return super.salario * 1.15;
    }

}
