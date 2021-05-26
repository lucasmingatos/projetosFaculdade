package aula05;


public class BrinquedoTest {

    public static void main(String[] args) {

        Brinquedo b1 = new Brinquedo();
        b1.setNome("Carro controle remoto");
        b1.setFaixaEtaria("6 a 10");
        b1.setPreco(54.50f);
        
        Brinquedo b2 = new Brinquedo("Boneco");
        b2.setFaixaEtaria("3 a 5");
        b2.setPreco(32.86f);
        
        Brinquedo b3 = new Brinquedo("Avião",94.66f);
        b3.setFaixaEtaria("3 a 5");
        
    }
    
}
