package aula01;

public class Exemplo02 {

    public static void main(String[] args){
        
        String str1 = "10";
        String str2 = "20";
        System.out.println(str1+str2);

        //converter String para int
        int n1 = Integer.parseInt(str1);
        int n2 = Integer.parseInt(str2);
        System.out.println(n1+n2);
        
        //converter String para double
        double d1 = Double.parseDouble(str1);
        double d2 = Double.parseDouble(str2);
        System.out.println(d1/d2);
    }
    
}
