package aula03;

public class CarroTest {

    public static void main(String[] args) {
        
        //Criação do Objeto
        Carro fusca = new Carro();
        fusca.fabricante = "VW";
        fusca.modelo = "Fusca";
        fusca.cor = "Azul";
        fusca.anofabricacao = 1967;
        fusca.ligar();
        
        Carro brasilia = new Carro();
        brasilia.fabricante = "VW";
        brasilia.modelo = "Brasília";
        brasilia.cor = "Amarela";
        brasilia.anofabricacao = 1974;
        brasilia.ligar();
        brasilia.desligar();
        
        fusca.desligar();
        
        System.out.println(fusca.toString());
        System.out.println(brasilia.toString());
        
    }
    
}
