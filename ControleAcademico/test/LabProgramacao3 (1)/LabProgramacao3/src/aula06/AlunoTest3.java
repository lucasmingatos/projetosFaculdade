package aula06;

import javax.swing.JOptionPane;

public class AlunoTest3 {

    public static void main(String[] args) {
        // OBJECT
        //   |--- ALUNO
        //        |------ ALUNOUNAERP
        //                     |-------ALUNOUNAERPLABPROGRAMACAOIII

        Aluno lista[] = new Aluno[5];
        int posicao = 0;
        String opcao;
        
        do{
            opcao = JOptionPane.showInputDialog("Opção:");
            switch(opcao){
                case "1":
                    lista[posicao++] = new AlunoUnaerp((int)(Math.random()*1000),"Nome "+posicao,Math.random()*10,Math.random()*10);
                    break;
                case "2":
                    lista[posicao++] = new AlunoUnaerpLab3((int)(Math.random()*1000),"Nome "+posicao,Math.random()*10,Math.random()*10,Math.random()*10);                    
                    break;
            }
        }while(!opcao.equals("0"));
        
        for(Aluno a : lista){
            
            //Alterar a nota 3 de um aluno de Lab Prog III
            if ( a instanceof AlunoUnaerpLab3){
                ((AlunoUnaerpLab3)a).setNota3(0.0);
            }
            
            System.out.println(a);
        }
        

        
        
    }
    
}
