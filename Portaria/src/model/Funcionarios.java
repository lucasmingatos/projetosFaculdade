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
@Table(name = "tb_funcionarios")
@NamedQueries(
        {
            @NamedQuery(name="Funcionarios.listar", query="SELECT f FROM Funcionarios f"),
            @NamedQuery(name="Funcionarios.contar", query="SELECT COUNT (f) FROM Funcionarios f"),            
            @NamedQuery(name="Funcionarios.porId", query="SELECT f FROM Funcionarios f WHERE f.id = :id"),           
            @NamedQuery(name="Funcionarios.porNome", query="SELECT f FROM Funcionarios f WHERE f.nome like :nome ")            
        }
)

public class Funcionarios implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    
    @Column(name = "codigo")
    private int codigo;
    
    @Column(name = "funcao", length = 100, nullable = false)
    private String funcao;
    
    @Column(name = "entre", length = 50, nullable = false)
    private String entre;

    public Funcionarios(Long id, String nome, int codigo, String funcao, String entre) {
        this.id = id;
        this.nome = nome;
        this.codigo = codigo;
        this.funcao = funcao;
        this.entre = entre;
    }
    public Funcionarios(){
        
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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
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
