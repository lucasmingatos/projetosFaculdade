package aula05;

public class Pessoa {

    private String nome;
    private String endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return getNome() + "\n" + getEndereco() + "\n";
    }
    
}
