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
@Table(name = "tb_visita")
@NamedQueries(
        {
            @NamedQuery(name="Visita.listar", query="SELECT v FROM Visita v"),
            @NamedQuery(name="Visita.contar", query="SELECT COUNT (v) FROM Visita v"),            
            @NamedQuery(name="Visita.porId", query="SELECT v FROM Visita v WHERE v.id = :id"),           
            @NamedQuery(name="Visita.porNome", query="SELECT v FROM Visita v WHERE v.nome like :nome ")            
        }
)
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = " id")
    private Long id;
    
    @Column(name = "rg")
    private int rg;
    
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    
    @Column(name = "entre", length = 10, nullable = false)
    private String entre;

    public Visita(Long id, int rg, String nome, String entre) {
        this.id = id;
        this.rg = rg;
        this.nome = nome;
        this.entre = entre;
    }
    
    public Visita(){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEntre() {
        return entre;
    }

    public void setEntre(String entre) {
        this.entre = entre;
    }
    
    
    @Override
    public String toString() {
        return nome;
    }
}
