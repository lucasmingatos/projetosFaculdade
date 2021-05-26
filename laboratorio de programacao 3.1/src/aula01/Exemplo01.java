package aula01;

import javax.swing.JOptionPane;

public class Exemplo01 {
    
    public static void main(String[] args){
        
        String str_n1;
        String str_n2;
        
        //entrada de dados
        str_n1 = JOptionPane.showInputDialog("Informe o 1o. número:");
        str_n2 = JOptionPane.showInputDialog("Informe o 2o. número:");
        
        //converter os dados para inteiro
        int n1 = Integer.parseInt(str_n1);
        int n2 = Integer.parseInt(str_n2);
        
        if (n1 == n2){
            JOptionPane.showMessageDialog(null, "Os valores são iguais!");
        }else{
            JOptionPane.showMessageDialog(null, "Os valores são diferentes!");
        }
        
    }
    
}
