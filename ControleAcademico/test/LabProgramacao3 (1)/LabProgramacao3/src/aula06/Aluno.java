package aula06;

public class Aluno extends Object {
    
    private int codigo;
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno() {
    }

    public Aluno(int codigo, String nome, double nota1, double nota2) {
        this.codigo = codigo;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    
    public double getMedia(){
        return (getNota1()+getNota2())/2;
    }
    
    
    @Override
    public String toString(){
        return String.format("%d - %s - %.2f",getCodigo(),getNome(),getMedia());
    }
    
}
