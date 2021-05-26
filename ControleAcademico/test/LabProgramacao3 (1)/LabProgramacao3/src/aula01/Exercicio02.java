package aula01;

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
        String nome = "João da Silva";
        double altura = 1.95;
        double peso = 92.58;
        double imc = (peso/Math.pow(altura,2));
        
        JOptionPane.showMessageDialog(null, 
            "Nome: " + nome + "\n" + 
            String.format("Altura: %.2f\n", altura)+
            String.format("Peso: %.2f\n", peso)+
            String.format("IMC: %.2f\n", imc),
            "Resultado",
            JOptionPane.WARNING_MESSAGE
        );
        
    }

}
