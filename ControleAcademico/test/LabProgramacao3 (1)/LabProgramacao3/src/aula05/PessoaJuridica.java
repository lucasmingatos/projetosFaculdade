package aula05;

public class PessoaJuridica extends Pessoa{

    private String cnpj;
    private String ie;

    public PessoaJuridica() {
        this("","","","");
    }
    
    public PessoaJuridica(String nome, String endereco, 
            String cnpj, String ie){
        super(nome,endereco);
        this.setCnpj(cnpj);
        this.setIe(ie);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    @Override
    public String toString() {
        return 
            super.toString() + getCnpj() + "\n" +  getIe();
    }
    
}
