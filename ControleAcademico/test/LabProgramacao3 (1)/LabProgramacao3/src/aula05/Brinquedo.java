package aula05;

public class Brinquedo {

    private String nome;
    private String faixaEtaria;
    private float preco;

    //CONSTRUTOR PADRÃO
    public Brinquedo() {
        this.nome = "NÃO DEFINIDO";
        this.faixaEtaria = "INVÁLIDA";
        this.preco = 0;
    }
    //CONSTRUTOR SOBRECARREGADO
    public Brinquedo(String nome) {
        this.nome = nome;
        this.faixaEtaria = "INVÁLIDA";
        this.preco = 0;
    }
//    public Brinquedo(String faixaEtaria) {
//        this.nome = "NÃO DEFINIDO";
//        this.faixaEtaria = faixaEtaria;
//        this.preco = 0;
//    }
    
    public Brinquedo(float preco) {
        this.nome = "NÃO DEFINIDO";
        this.faixaEtaria = "INVÁLIDA";
        this.preco = preco;
    }
    
    public Brinquedo(String nome, float preco) {
        this.nome = nome;
        this.faixaEtaria = "INVÁLIDA";
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFaixaEtaria(String faixaEtaria) {

        if (faixaEtaria.equals("0 a 2")
                || faixaEtaria.equals("3 a 5")
                || faixaEtaria.equals("6 a 10")
                || faixaEtaria.equals("acima de 10")) {
            this.faixaEtaria = faixaEtaria;
        }else{
            this.faixaEtaria = "INVÁLIDA";
        }
        
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getFaixaEtaria(){
        return this.faixaEtaria;
    }
    
    public float getPreco(){
        return this.preco;
    }

    @Override
    public String toString() {
        return getNome() + "\n" + getFaixaEtaria() +
            String.format("R$ %.2f",getPreco());
    }
    

}
