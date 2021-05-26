package model;


public class Chuteira {
    
    private int id;
    private String nome;
    //private int id_tipo;
    private String cor;
    private int quantidade;
    private double preco; 
    private int id_marca;
    
    public Chuteira(){
        
    }

    public Chuteira(int id, String nome,  String cor, int quantidade, double preco, int id_marca) {
        this.id = id;
        this.nome = nome;
        //this.id_tipo = id_tipo;
        this.cor = cor;
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

   /* public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    } */

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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
        return nome;
    }
       
}
