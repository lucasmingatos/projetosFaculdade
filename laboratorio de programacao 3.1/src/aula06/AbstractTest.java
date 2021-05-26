package aula06;



public class AbstractTest {
    
    public static void main(String[] args) {
        
        //não é possivel instanciar classes abstratas
        // Funcionario f1 = Funcionario();
        
        Gerente g1 = new Gerente("Joao barnabé", 1000.00);
        System.out.println(g1);
        
        Vendedor v1 = new Vendedor("Jonei", 1000.00, 10000.00);
        System.out.println(v1);
    }
    
}
