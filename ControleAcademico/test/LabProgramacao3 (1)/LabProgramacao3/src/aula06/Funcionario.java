package aula06;

public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract String getNome();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double getSalario();

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return getNome() + "\n" + 
            String.format("R$ %.2f\n",getSalario());
    }
    
    
    
}
