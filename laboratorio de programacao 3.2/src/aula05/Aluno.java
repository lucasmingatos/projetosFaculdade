package aula05;

public class Aluno {
    
    private int codigo;
    private String nome;
    private String curso;

    public Aluno(){
        
    }
    
    public Aluno(int codigo, String nome, String curso) {
        this.codigo = codigo;
        this.nome = nome;
        this.curso = curso;
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "codigo=" + codigo + ", nome=" + nome + ", curso=" + curso + '}';
    }
    
    
    
}
