package aula05;

public class PessoaTest {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("João da Silva", "Av. 9 de Julho");
        System.out.println(p1);
        
        PessoaFisica pf1 = new PessoaFisica();
        pf1.setNome("Ana Maria");
        pf1.setEndereco("Av. 22 de Março");
        pf1.setCpf("123.456.789-00");
        pf1.setCnh("1234567-8");
        System.out.println(pf1);
               
        
    }
    
    
}
