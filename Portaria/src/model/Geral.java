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
@Table(name = "tb_geral")
@NamedQueries(
        {
            @NamedQuery(name="Geral.listar", query="SELECT g FROM Geral g"),
            @NamedQuery(name="Geral.contar", query="SELECT COUNT (g) FROM Geral g"),            
            @NamedQuery(name="Geral.porId", query="SELECT g FROM Geral g WHERE g.id = :id"),           
            @NamedQuery(name="Geral.porNome", query="SELECT g FROM Geral g WHERE g.nome like :nome ")            
        }
)

public class Geral implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "codigo")
    private int codigo;
    
    @Column(name = "funcao", length = 100, nullable = false)
    private String funcao;
    
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    
    @Column(name = "entre", length = 10, nullable = false)
    private String entre;
    
    public Geral(){
        
    }

    public Geral(Long id, int codigo, String funcao, String nome, String entre) {
        this.id = id;
        this.codigo = codigo;
        this.funcao = funcao;
        this.nome = nome;
        this.entre = entre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    
    
    
    
    
    
    
    
    
    

