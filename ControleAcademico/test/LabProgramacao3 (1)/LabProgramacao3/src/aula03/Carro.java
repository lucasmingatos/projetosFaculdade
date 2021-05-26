
package aula03;


//Especificação da classe CARRO
public class Carro {
    
    //Atributos = características
    public String fabricante;
    public String modelo;
    public int anofabricacao;
    public String cor;
    
    //Métodos = comportamentos
    public void ligar(){
        System.out.println(
           modelo + " ligado."
        );
    }
    public void desligar(){
        System.out.println(
           modelo + " desligado."
        );
    }
 
    /*
     * Método: toString
     * retorna todos os dados do objeto
     * no formato String
     */
    @Override
    public String toString(){
        return modelo 
            + " (" + fabricante + ") - "
            + anofabricacao + " - " 
            + cor;
    }
    
}
