
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
@Table(name = "tb_entrada")
@NamedQueries(
        {
            @NamedQuery(name="Entrada.listar", query="SELECT c FROM Entrada c"),
            @NamedQuery(name="Entrada.contar", query="SELECT COUNT (c) FROM Entrada c"),            
                        
        }
)



public class Entrada implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "entre", length = 10, nullable = false)
    private String entre;

    public Entrada(Long id, String entre) {
        this.id = id;
        this.entre = entre;
    }
    public Entrada(){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntre() {
        return entre;
    }

    public void setEntre(String entre) {
        this.entre = entre;
    }
    
    
    @Override
    public String toString() {
        return entre;
    }
    
    
}
