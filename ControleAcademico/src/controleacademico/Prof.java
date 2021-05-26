package controleacademico;

import javax.swing.JOptionPane;

public class Prof {
    
    private String nome;
    private String codigo;
    int disciplinasCadastradas = 0;
    DisciplinaProfessores disciplinas[] = new DisciplinaProfessores[8];
    
    public Prof(){
        this.nome = "Nenhum registro de nome";
        this.codigo = "Nenhum registro de nome";
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public boolean setCodigo(String codigo, int profCadastrados, Prof prof[]){
        if (tryCodigo (codigo, profCadastrados, prof)){
            JOptionPane.showMessageDialog(null, "Código já cadastrado");
            return true;
        } else{
            this.codigo = codigo;
            return false;
        }
    }
    
    private boolean tryCodigo (String codigo, int profCadastrados, Prof prof[]){
        for (int c = 0; c < profCadastrados; c++){
            if (codigo.equals (prof[c].getCodigo())){
                return true;
            }
        }
        return false;
    }
    
    public void setDisciplinas (String disciplina, int cnd){
        this.disciplinas[disciplinasCadastradas] = new DisciplinaProfessores();
        
        if (cnd == 0){
            this.disciplinas[disciplinasCadastradas].disciplina = disciplina;
        } else{
            setDisciplinas();
        }
    }
    
    private void setDisciplinas(){
        String disciplina = "|";
        
        while (!disciplina.equals ("0") && disciplinasCadastradas < 8){
            disciplina = JOptionPane.showInputDialog("Insira o nome da disciplina a ser cadastrada " +
                                        "");
            
            if (!disciplina.equals ("0")){
                if (verificarDisciplina(disciplina)){
                    JOptionPane.showMessageDialog(null, "Disciplina já cadastrada!");
                }else{
                    setDisciplinas(disciplina, 0);
                }
            }
        }
    }
    
    private boolean verificarDisciplina(String disciplina){
        for (int c = 0; c < disciplinasCadastradas; c++){
            if (disciplina.equals(disciplinas[c].getDisciplina())){
                return true;
            }
        }
        return false;
    }
    
    public void alterarDisciplinas (){
        String disciplina;
        
        int c = 1;
        
        while (c != 0){
            StringBuilder sb = new StringBuilder();
            
            for (c = 0; c < disciplinasCadastradas; c++){
                sb.append(String.format("[%2d] ", c + 1)).append(this.disciplinas[c].getDisciplina()).append("\n");
            }
            
            sb.append("0) Sair");
            
            boolean busca = true;
            
            do{
                try{

                    c = Integer.parseInt (JOptionPane.showInputDialog("Insira a disciplina a ser modificada " +
                                        "(digite 0 para voltar ao menu inicial)" + sb));
                    busca = false;

                } catch (NumberFormatException nexc){
                    JOptionPane.showMessageDialog(null, "Número inserido inválido!");
                }
            } while (busca);
            
            if (c != 0){
                if (c > 0 && c < (getDisciplinasCadastradas() + 1)){
                    disciplina = JOptionPane.showInputDialog("Insira a disciplina a ser modificada:");
                    if (verificarDisciplina(disciplina)){
                        JOptionPane.showMessageDialog(null, "Disciplina já cadastrada!");
                    }else{
                        disciplinas[c-1].setDisciplina(disciplina);
                    }
                }
            }
        }
    }
    
    
    public int getDisciplinasCadastradas(){
        return this.disciplinasCadastradas;
    }
    
    @Override
    public String toString (){
        StringBuilder sb = new StringBuilder();
        
        for (int c = 0; c < disciplinasCadastradas; c++){
            sb.append(disciplinas[c].getDisciplina()).append("\n");
        }
        
        return "NOME: " + this.getNome() +
                "CÓDIGO: " + this.getCodigo() +
                "Disciplinas ministradas:\n" + sb + "\n";
    }
}
            
    

