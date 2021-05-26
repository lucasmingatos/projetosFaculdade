package model;

public class Acessorios {
    
    
    private int id;
    private String nome;
    private String categoria;
    private int quantidade;
    private double preco; 
    private int id_marca;
    
    public Acessorios(){
        
    }
    
    public Acessorios(int id, String nome, String categoria, int quantidade, double preco, int id_marca) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
