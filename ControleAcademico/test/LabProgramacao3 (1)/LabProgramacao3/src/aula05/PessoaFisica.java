package aula05;

public class PessoaFisica extends Pessoa{

    private String cpf;
    private String cnh;

    public PessoaFisica() {
        //super();
        //this.setCpf("");
        //this.setCnh("");
        
        this("","","","");
    }
    
    public PessoaFisica(String nome, String endereco, 
            String cpf, String cnh){
        super(nome,endereco);
        this.setCpf(cpf);
        this.setCnh(cnh);
    }
    
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return 
            super.toString()  +
            getCpf() + "\n" +
            getCnh();
    }
    
}
