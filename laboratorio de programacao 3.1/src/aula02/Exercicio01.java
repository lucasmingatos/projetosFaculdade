package aula02;

import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Produto: ");
        double v1 = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
        double v2 = v1;

        if (v1 >= 0) {
            if (v1 >= 50 && v1 < 200) {
                v2 = v1 * 0.95;
            } else if (v1 >= 200 && v1 < 500) {
                v2 = v1 * 0.94;
            } else if (v1 >= 500 && v1 < 1000) {
                v2 = v1 * 0.93;
            } else if (v1 >= 1000) {
                v2 = v1 * 0.92;
            }
            
            JOptionPane.showMessageDialog(null,
                "Produto: " + nome + "\n"
                + "Valor Original: " + String.format("R$ %.2f \n", v1)
                + "Valor com Desconto: " + String.format("R$ %.2f \n", v2)
            );
        } else {
            JOptionPane.showMessageDialog(null, "Valor inválido.");
        }
    }
}
