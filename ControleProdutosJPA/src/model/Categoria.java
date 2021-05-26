package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "tb_categoria")
@NamedQueries(
    {
        @NamedQuery(name="Categoria.listar", query="SELECT c FROM Categoria c"),
        @NamedQuery(name="Categoria.contar", query="SELECT COUNT(c) FROM Categoria c"),
        @NamedQuery(name="Categoria.porId", query="SELECT c FROM Categoria c WHERE c.id = :id"),
        @NamedQuery(name="Categoria.porNome", query="SELECT c FROM Categoria c WHERE c.nome like :nome")
    }
)
public class Categoria implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;
    
    @Column (name = "nome", length = 60)
    private String nome;

    public Categoria() {
    }

    public Categoria(Long id, String nome) {
        this.id = id;
        this.nome = nome;
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

    @Override
    public String toString() {
        return this.nome;
    }
    
}
