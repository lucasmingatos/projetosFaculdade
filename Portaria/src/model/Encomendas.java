/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_encomendas")
@NamedQueries(
        {
            @NamedQuery(name="Encomendas.listar", query="SELECT e FROM Encomendas e"),
            @NamedQuery(name="Encomendas.contar", query="SELECT COUNT (e) FROM Encomendas e"),            
            @NamedQuery(name="Encomendas.porId", query="SELECT e FROM Encomendas e WHERE e.id = :id"),           
            @NamedQuery(name="Encomendas.porNome", query="SELECT e FROM Encomendas e WHERE e.nome like :nome ")            
        }
)
public class Encomendas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "codigo")
    private int codigo;

    @Column(name = "entre", length = 50, nullable = false)
    private String stat;

    public Encomendas(Long id, String nome, int codigo, String stat) {
        this.id = id;
        this.nome = nome;
        this.codigo = codigo;
        this.stat = stat;
    }
    
    public Encomendas(){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return nome;
    }

}
