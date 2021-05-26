package model;

public class Marca {
    
    private int id;
    private String razaosocial;
    private String nomefantasia;
    private String cnpj;
    
    public Marca(){
        
    }

    public Marca(int id, String razaosocial, String nomefantasia, String cnpj) {
        this.id = id;
        this.razaosocial = razaosocial;
        this.nomefantasia = nomefantasia;
        this.cnpj = cnpj;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return nomefantasia;
    }
     
}
