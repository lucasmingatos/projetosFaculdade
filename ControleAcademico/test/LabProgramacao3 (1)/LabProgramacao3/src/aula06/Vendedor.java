package aula06;

public class Vendedor extends Funcionario {

    private double totalvendas;

    public Vendedor() {
    }

    public Vendedor(String nome, double salario, double totalvendas) {
        super(nome, salario);
        this.totalvendas = totalvendas;
    }

    public double getTotalvendas() {
        return totalvendas;
    }

    public void setTotalvendas(double totalvendas) {
        this.totalvendas = totalvendas;
    }

    @Override
    public String getNome() {
        return super.nome + " (Vendedor)";
    }

    @Override
    public double getSalario() {
        return super.salario + (getTotalvendas()*0.05);
    }

}
