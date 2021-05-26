package controleacademico;

import javax.swing.JOptionPane;


public class ControleAcademico {

    public static void main(String[] args) {

       StringBuilder sb = new StringBuilder();
       
            sb.append("=================\n");
            sb.append("======MENU=======\n");
            sb.append("=================\n");
            sb.append("1) CADASTRAR ALUNO");
            sb.append("\n2) CADASTRAR PROFESSOR\n");
            sb.append("3) ALTERAR DADOS DO ALUNO\n");
            sb.append("4) ALTERAR DADOS DO PROFESSOR\n");
            sb.append("5) BUSCAR ALUNO\n");
            sb.append("6) BUSCAR PROFESSOR\n");
            sb.append("7) RELATÓRIO DOS ALUNOS\n");
            sb.append("8) RELATÓRIO DOS PROFESSORES\n");
            //sb.append("9) INFORMAÇÕES ESTATÍSTICAS\n");
            sb.append("0) SAIR DA EXECUÇÃO\n");
            
        Aluno aluno[] = new Aluno[100];
        
        Prof prof[] = new Prof[5];
        
        int alunosCadastrados = 0, profCadastrados = 0, opc;
        
        do{
            String codigo;
            
            opc = Integer.parseInt(JOptionPane.showInputDialog(sb));
            
            switch(opc){
                
                case 1: 
                    if(alunosCadastrados < 100){
                        aluno[alunosCadastrados] = new Aluno();
                        aluno[alunosCadastrados].setNome(JOptionPane.showInputDialog("Insira o nome do aluno:"));
                        
                        boolean bool;
                        do{
                            bool = aluno[alunosCadastrados].setCodigo(JOptionPane.showInputDialog("Insira o codigo"+
                                    "do aluno: "), alunosCadastrados, aluno);
                        }while(bool);
                        
                        aluno[alunosCadastrados].setCurso(JOptionPane.showInputDialog("Insira o curso realizado:"));
                        
                        aluno[alunosCadastrados].setDisciplinas(JOptionPane.showInputDialog("Insira a(s) disciplina(s)"+
                                "cursada(s) pelo aluno"), aluno[alunosCadastrados].getDisciplinasCadastradas());
                        
                        alunosCadastrados++;
                    }else{
                        JOptionPane.showMessageDialog(null, "Número máximo de inserções atingido (20)");
                    }
                    break;
                
                case 2:
                    if (profCadastrados < 5){
                        prof[profCadastrados] = new Prof();
                        prof[profCadastrados].setNome(JOptionPane.showInputDialog("Informe o nome do professor:"));
                        
                        boolean bool;
                        do{
                            bool = prof[profCadastrados].setCodigo(JOptionPane.showInputDialog("Informe o codigo"+
                                    "do professor:"), profCadastrados, prof);
                        }while(bool);
                        
                        prof[profCadastrados].setDisciplinas(JOptionPane.showInputDialog("Informe a(s) disciplina(s"+
                                "ministrada(s) pelo professor"), prof[profCadastrados].getDisciplinasCadastradas());
                        
                        profCadastrados++;
                    }else{
                        JOptionPane.showMessageDialog(null, "Número máximo de inserções atingido");
                    }
                    break;
                
                case 3:
                    codigo = JOptionPane.showInputDialog("Insira o codigo do aluno que deseja editar:");
                    
                    int c, cnd;
                    
                    for(c = 0; c < alunosCadastrados; c++){
                        if(codigo.equals (aluno[c].getCodigo())){
                            cnd = Integer.parseInt(JOptionPane.showInputDialog("Informe o dado que deseja editar"+
                                    "1) NOME\n"+
                                    "2) CÓDIGO\n"+
                                    "3) CURSO\n"+
                                    "4) DISCIPLINAS\n"+
                                    "5) NOTA PARCIAL\n"+
                                    "6) NOTA FINAL\n"+
                                    "0) CANCELAR\n"));
                            
                            switch(cnd){
                                case 1:
                                    aluno[c].setNome(JOptionPane.showInputDialog("Insira o nome para alteração"));
                                    break;
                                
                                case 2:
                                    boolean bool;
                                    do{
                                        bool = aluno[c].setCodigo(JOptionPane.showInputDialog("Insira o codigo"+
                                                "para alterção:"), alunosCadastrados, aluno);
                                    }while(bool);
                                    break;
                                
                                case 3:
                                    aluno[c].setCurso(JOptionPane.showInputDialog("Insira o curso para alteração:"));
                                    break;
                                
                                case 4:
                                    aluno[c].alterarDisciplinas();
                                    break;
                                
                                case 5:
                                    aluno[c].alterarParcial();
                                    break;
                                    
                                case 6:
                                    aluno[c].alterarFinal();
                                    break;
                                
                                case 0:
                                    if(JOptionPane.showInputDialog("Deseja finalizar as alterações? (S/N)").toLowerCase()
                                            .equals("s")){
                                        cnd = 90;
                                    }
                                    break;
                            }
                            
                            c = alunosCadastrados + 1;
                        }else{
                            JOptionPane.showMessageDialog(null, "Código não encontrado nos registros");
                        }
                    }
                    if(c != (alunosCadastrados + 1)){
                        JOptionPane.showMessageDialog(null, "Código não encontrado");
                    }
                    break;
                
                case 4:
                    codigo = JOptionPane.showInputDialog("Insira o codigo do professor que deseja editar");
                    
                    for(c = 0; c < profCadastrados; c++){
                        if(codigo.equals(prof[c].getCodigo())){
                            
                        }
                    }
                    
                    cnd = Integer.parseInt(JOptionPane.showInputDialog("Informe o dado que deseja editar"+
                                    "1) NOME\n"+
                                    "2) CÓDIGO\n"+
                                    "3) DISCIPLINAS\n"+
                                    "0) CANCELAR\n"));
                    
                            switch(cnd){
                                case 1:
                                    prof[c].setNome(JOptionPane.showInputDialog("Insira o nome para alteração"));
                                    break;
                                
                                case 2:
                                    boolean bool;
                                    do{
                                        bool = prof[c].setCodigo(JOptionPane.showInputDialog("Insira o codigo"+
                                                "para alterção:"), profCadastrados, prof);
                                    }while(bool);
                                    
                                case 3:
                                    prof[c].alterarDisciplinas();
                                    break;
                                
                                case 0:
                                    if(JOptionPane.showInputDialog("Tem certeza que deseja sair das alterações? <s/n>").toLowerCase()
                                            .equals("s")){
                                       cnd = 90;
                                }
                                    break;
                            }
                            
                            break;
                            
                case 5:
                    codigo = JOptionPane.showInputDialog("Insira o código do aluno que deseja pesquisar:");
                    
                    for(c = 0; c < alunosCadastrados; c++){
                        if(aluno[c].getCodigo().equals(codigo)){
                            aluno[c].toString();
                        }
                    }
                break;
                
                case 6:
                    codigo = JOptionPane.showInputDialog("Insira o código que do professor que deseja pesquisar:");
                    
                    for(c = 0; c < profCadastrados; c++){
                        if(prof[c].getCodigo().equals(codigo)){
                            prof[c].toString();
                        }
                    }
                break;
                
                case 7:
                    for(c = 0; c < alunosCadastrados; c++){
                        JOptionPane.showMessageDialog(null, "Aluno" + (c+1) + alunosCadastrados + ": \n" +
                                aluno[c].toString());
                    }
                break;
                
                case 8:
                    for(c = 0; c < profCadastrados; c++){
                        JOptionPane.showMessageDialog(null, "Professor" + (c+1) + alunosCadastrados + ": \n" +
                                aluno[c].toString());
                    }
                
                
                break;
                
                case 0:
                    if("n".equals(JOptionPane.showInputDialog("Deseja finalizar a execução do programa? (S/N)"))){
                        opc = 99;
                    }
                break;  
            }
        }while(opc != 0 || alunosCadastrados == 100);
    }
    
}
