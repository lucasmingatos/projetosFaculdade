 package model;

public class Tenis {
    
    private int id;
    private String nome;
    //private int id_tipo2;
    private int quantidade;
    private double preco; 
    private int id_marca;
    
    
    public Tenis(){
        
    }
    
    public Tenis(int id, String nome, int quantidade, double preco, int id_marca) {
        this.id = id;
        this.nome = nome;
        //this.id_tipo2 = id_tipo2;
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

   /* public int getId_tipo2() {
        return id_tipo2;
    }

    public void setId_tipo2(int id_tipo2) {
        this.id_tipo2 = id_tipo2;
    } */

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
        return nome;
    }
    
}
