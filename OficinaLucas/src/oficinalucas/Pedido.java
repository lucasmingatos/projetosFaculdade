/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficinalucas;

/**
 *
 * @author 826274
 */
public class Pedido {
    
    String nome;
    String vendedor;
    String produto;
    int quantidade;
    String valor;

    public Pedido() {
    }

    public Pedido(String nome, String vendedor, String produto, int quantidade, String valor) {
        this.nome = nome;
        this.vendedor = vendedor;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
    
}
