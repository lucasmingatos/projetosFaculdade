package aula02;

import javax.swing.JOptionPane;

public class Exemplo01Switch {

    public static void main(String[] args) {
        
        String sigla = JOptionPane.showInputDialog(
            "Informe a SIGLA do estado: "
        );
        
        String estado = "";
        switch(sigla.toUpperCase()){
            case "SP":
                estado = "São Paulo";
                break;
            case "MG":
                estado = "Minas Gerais";
                break;
            default:
                estado = "Sigla não encontrada.";
        }
        
        JOptionPane.showMessageDialog(null, estado);
        
    }

    
}
