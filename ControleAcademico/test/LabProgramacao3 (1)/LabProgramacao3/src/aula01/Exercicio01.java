package aula01;

import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String[] args) {
        
        double np, nf, mf;
        
        np = Double.parseDouble(JOptionPane.showInputDialog(
            "Nota parcial:"));
        nf = Double.parseDouble(JOptionPane.showInputDialog(
            "Nota final:"));
        mf = (np*0.40+nf*0.60);
        
        JOptionPane.showMessageDialog(null, 
            String.format("Média final= %.2f ", mf)
        );
        
    }

    
}
