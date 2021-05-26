package aula06;

import javax.swing.JOptionPane;

public class AlunoTest3 {
    
    public static void main(String[] args) {
        //     OBJECT 
        //          ALUNO
        //              ALUNOUNAERP
        //                      ALUNOUNAERPLABPROGRAMACAO03
        
        Aluno lista[] = new Aluno[5];
        
        int posicao=0;
        String opcao;
        
        do{
            
            opcao=JOptionPane.showInputDialog("Opção: ");
            
            switch(opcao){
                
                case "1":
                    lista[posicao] = new AlunoUnaerp(int)(Math.random()*1000),"zé",posicao);
                    break;
                case "2":
                    lista[posicao++] = new AlunoUnaerpLabProgramacao03(int)(Math.random()*1000),"juca",posicao);
                    break;        
            }
            
        }while(!opcao.equals("0"));
             
    }
    
}
