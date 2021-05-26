package aula06;

public class AbstractTest {

    public static void main(String[] args) {
        
        //Não é possível instanciar classes abstratas
        //Funcionario f1 = new Funcionario();
        
        Gerente g1 = new Gerente("João da Silva",1000.00);
        System.out.println(g1);
        
        Vendedor v1 = new Vendedor("José", 1000.00, 10000.00);
        System.out.println(v1);
        
    }
    
}
