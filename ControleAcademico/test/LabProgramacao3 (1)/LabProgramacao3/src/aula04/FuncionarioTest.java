package aula04;

public class FuncionarioTest {
    
    public static void main(String[] args) {
    
        Funcionario joao = new Funcionario();
        System.out.println(joao);
        
        joao.setNome("João da Silva");
        joao.setSalario(1250.00);
        joao.setAnoContratacao(1988);
        
        System.out.println(joao);
        
        Funcionario ana = new Funcionario("Ana",957.00, 2007);
        System.out.println(ana);
        
        Funcionario carlos = new Funcionario("Carlos Francisco");
        System.out.println(carlos);
        
        
    }
    
}
