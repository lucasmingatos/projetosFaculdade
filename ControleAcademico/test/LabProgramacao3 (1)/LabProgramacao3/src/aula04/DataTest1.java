package aula04;

public class DataTest1 {

    public static void main(String[] args) {
        
        Data hoje = new Data();
        
        //hoje.dia = 15;          //atribuir
        hoje.setDia(15);
        hoje.setMes(3);
        hoje.setAno(2018);
        
        System.out.println(hoje.getDataFormatada());
        System.out.println(hoje.getDataPorExtenso());
        
    }
    
}
