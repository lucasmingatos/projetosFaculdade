package aula02;

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
        
        double re = 0;
        double maior = 0, menor  = 0;
        
        StringBuilder sb = new StringBuilder();
        sb.append("Resistências fornecidas").append("\n");
        
        for (int i = 1; i <= 4; i++) {
            double vr = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
            re += vr;
            if (i == 1){
                maior = menor = vr;
            }else{
                maior = Math.max(maior, vr);
                menor = Math.min(menor, vr);
            }
            sb.append(vr).append("; ");
        }
        
        sb.append("\n")
            .append("Resistência Equiv.= ").append(re).append("\n")
            .append("Maior resistência = ").append(maior).append("\n")
            .append("Menor resistência = ").append(menor);
        
        JOptionPane.showMessageDialog(null,sb.toString());
    }
}
