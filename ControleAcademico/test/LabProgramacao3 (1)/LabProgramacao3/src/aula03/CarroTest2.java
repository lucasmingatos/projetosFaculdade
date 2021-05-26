package aula03;

public class CarroTest2 {

    public static void main(String[] args) {

        Carro carros[] = new Carro[5];

        //instanciar 5 objetos
        for (int i = 0; i < carros.length; i++) {
            carros[i] = new Carro();
            carros[i].fabricante = "Fabricante " + (i + 1);
            carros[i].modelo = "Modelo " + (i + 1);
            carros[i].cor = "Cor " + (i + 1);
            carros[i].anofabricacao = 1960 + (int)(Math.random()*40);
        }

        //exibir os dados 
        for (Carro c : carros) {
            System.out.println(c);
        }

    }

}
