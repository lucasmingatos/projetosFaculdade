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
@Table(name = "tb_carro")
@NamedQueries(
        {
            @NamedQuery(name="Carro.listar", query="SELECT m FROM Carro m"),
            @NamedQuery(name="Carro.contar", query="SELECT COUNT (m) FROM Carro m"),            
            @NamedQuery(name="Carro.porId", query="SELECT m FROM Carro m WHERE m.id = :id"),           
            @NamedQuery(name="Carro.porNome", query="SELECT m FROM Carro m WHERE m.placa like :placa ")            
        }
)
public class Carro implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = " id")
    private Long id;
    
    @Column(name = "codigo")
    private int codigo;
    
    @Column(name = "modelo", length = 45, nullable = false)
    private String modelo;

    @Column(name = "placa", length = 30, nullable = false)
    private String placa;
    
    @Column(name = "entre", length = 10, nullable = false)
    private String entre;

    public Carro(Long id, int codigo, String modelo, String placa, String entre) {
        this.id = id;
        this.codigo = codigo;
        this.modelo = modelo;
        this.placa = placa;
        this.entre = entre;
    }
    
    public Carro(){
        
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getEntre() {
        return entre;
    }

    public void setEntre(String entre) {
        this.entre = entre;
    }
    
    @Override
    public String toString() {
        return placa;
    }
}
