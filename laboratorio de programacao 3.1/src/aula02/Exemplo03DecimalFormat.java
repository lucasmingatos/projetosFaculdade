package aula02;

import java.text.DecimalFormat;

public class Exemplo03DecimalFormat {


    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        double valor = 1487.968;
        
        System.out.println(valor);
        System.out.println(df.format(valor));
        
    }
    
}
