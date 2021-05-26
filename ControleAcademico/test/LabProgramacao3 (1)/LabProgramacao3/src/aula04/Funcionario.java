package aula04;

import java.time.Year;

public class Funcionario {

    private String nome;
    private double salario;
    private int anocontratacao;

    //CONSTRUTOR PADRÃO
    public Funcionario(){
        this.nome = "nome não definido";
        this.salario = 0;
        this.anocontratacao = Year.now().getValue();
    }
    //CONSTRUTOR SOBRECARREGADO
    public Funcionario(String nome){
        setNome(nome);
        this.salario = 0;
        this.anocontratacao = Year.now().getValue();
    }
    //CONSTRUTOR SOBRECARREGADO
    public Funcionario(String nome, double salario, 
            int anocontracacao){
        setNome(nome);
        setSalario(salario);
        setAnoContratacao(anocontratacao);
    }
    
    
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome.toUpperCase();
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }

    public double getSalario() {
        return this.salario;
    }

    public void setAnoContratacao(int anocontratacao) {
        if (anocontratacao >= (Year.now().getValue() - 120)
                && anocontratacao <= Year.now().getValue()) {
            this.anocontratacao = anocontratacao;
        }
    }

    public double getAnoContratacao() {
        return this.anocontratacao;
    }

    public double getBonificacao() {
        int tempo = Year.now().getValue() - anocontratacao;
        if (tempo >= 5 && tempo < 10) {
            return this.salario * 0.05;
        } else if (tempo >= 10 && tempo < 20) {
            return this.salario * 0.10;
        } else if (tempo >= 20) {
            return this.salario * 0.20;
        } else {
            return 0;
        }
    }

    public double getSalarioTotal() {
        return getSalario() + getBonificacao();
    }
    
    @Override
    public String toString(){
        return String.format(
            "Nome: %s \nSalário: R$ %.2f \n",
            getNome(), getSalarioTotal()
        );
    }

}
