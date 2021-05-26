package model;

public class Vestuario {
    
    private int id;
    private String nome;
    private String especi;
    private int quantidade;
    private double preco; 
    private int id_marca;

    public Vestuario() {
    }

    public Vestuario(int id, String nome, String especi, int quantidade, double preco, int id_marca) {
        this.id = id;
        this.nome = nome;
        this.especi = especi;
        this.quantidade = quantidade;
        this.preco = preco;
        this.id_marca = id_marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspeci() {
        return especi;
    }

    public void setEspeci(String especi) {
        this.especi = especi;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    @Override
    public String toString() {
        return  nome; 
    }
    
    
    
}
