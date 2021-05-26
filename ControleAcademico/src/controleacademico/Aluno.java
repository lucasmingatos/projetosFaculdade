package controleacademico;

import javax.swing.JOptionPane;

public class Aluno{
    
    private String nome;
    private String codigo;
    private String curso;
    private int disciplinasCadastradas = 0;
    DisciplinaAlunos disciplinas[] = new DisciplinaAlunos[20];
    
    public Aluno(){
        this.nome = "Sem registros de nome";
        this.codigo = "Sem registros de codigo";
        this.curso = "Sem registros de curos";
    }
    
    public Aluno(String nome, String codigo, String curso) {
        this.nome = nome;
        this.codigo = codigo;
        this.curso = curso;
    }
    
    public String getNome() {
        return this.nome;
    }
    
     public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCodigo() {
        return this.codigo;
    }
    
    public boolean setCodigo(String codigo, int alunosCadastrados, Aluno aluno[]) {
        if (tryCodigo (codigo, alunosCadastrados, aluno)){
            JOptionPane.showMessageDialog(null, "Código já cadastrado");
            return true;
        } else{
            this.codigo = codigo;
            return false;
        }
    }
    
    private boolean tryCodigo (String codigo, int alunosCadastrados, Aluno aluno[]){
        for (int c = 0; c < alunosCadastrados; c++){
            if (codigo.equals (aluno[c].getCodigo())){
                return true;
            }
        }
        return false;
    }

    public String getCurso() {
        return this.curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public int getDisciplinasCadastradas(){
        return this.disciplinasCadastradas;
    }
    
    public void setDisciplinas(String disciplina, int cnd){
        this.disciplinas[disciplinasCadastradas] = new DisciplinaAlunos();
        
        
        if (cnd == 0){
            this.disciplinas[disciplinasCadastradas].disciplina = disciplina;

            this.disciplinas[disciplinasCadastradas].setNotaParcial (JOptionPane.showInputDialog("Insira " +
                                            "a nota da prova parcial parcial da disciplina " + 
                                            this.disciplinas[disciplinasCadastradas].getDisciplina() + 
                                            " (0 - 10):"));
            
            this.disciplinas[disciplinasCadastradas].setNotaFinal (JOptionPane.showInputDialog("Insira " +
                                            "a nota da prova final da disciplina " +
                                            this.disciplinas[disciplinasCadastradas].getDisciplina() +
                                            " (0 - 10):"));
            disciplinasCadastradas++;
        }else{
            setDisciplinas ();
        }
        
        if (disciplinasCadastradas == 1){
            setDisciplinas();
        }
    }
    
    private void setDisciplinas (){
        String disciplina = "|";
        
        while (!disciplina.equals ("0") && disciplinasCadastradas < 20){
            disciplina = JOptionPane.showInputDialog("Insira o nome da disciplina a ser cadastrada " +
                                        "(digite 0 para retornar ao menu inicial):");
            
            if (!disciplina.equals ("0")){
                if (verificaDisciplinas(disciplina)){
                    JOptionPane.showMessageDialog(null, "Disciplina já cadastrada!");
                }else{
                    setDisciplinas(disciplina, 0);
                }
            }
        }
    }
    
    
    private boolean verificaDisciplinas (String disciplina){
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
                                        "(digite 0 para voltar ao menu inicial):" + sb));
                    busca = false;

                } catch (NumberFormatException num){
                    JOptionPane.showMessageDialog(null, "Número inserido inválido!");
                }
            } while (busca);
            
            if (c != 0){
                if (c > 0 &&c < 21){
                    disciplina = JOptionPane.showInputDialog("Insira o nome para alteração: ");
                    if (verificaDisciplinas(disciplina)){
                        JOptionPane.showMessageDialog(null, "Disciplina já cadastrada!");
                    }else{
                        disciplinas[c-1].setDisciplina(disciplina);
                    }
                }
            }
        }
    }
    
    public void alterarFinal (){
        int c = 1;
        
        while (c != 0){
            StringBuilder sb = new StringBuilder();
            
            for (c = 0; c < disciplinasCadastradas; c++){
                sb.append(String.format("[%2d] ", c + 1)).append(this.disciplinas[c].getDisciplina()).append("\n");
            }
            
            sb.append("0) Sair");
            
            boolean teste = true;
            
            do{
                try{

                    c = Integer.parseInt (JOptionPane.showInputDialog("Insira a disciplina que deseja alterar a nota final:" +
                                        "(digite 0 para voltar ao menu inicial):" + sb));
                    teste = false;

                } catch (NumberFormatException num){
                    JOptionPane.showMessageDialog(null,"Número inserido inválido!");
                }
            } while (teste);
            
            if (c != 0){
                if (c > 0 && c < (getDisciplinasCadastradas() + 1)){
                    disciplinas[c].setNotaFinal(JOptionPane.showInputDialog("insira a nova nota final da disciplina " +
                                            disciplinas[c].getDisciplina() + "(0 - 10)"));
                }
            }
        }
    }
    
    public void alterarParcial (){
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

                    c = Integer.parseInt (JOptionPane.showInputDialog("Insira a disciplina que deseja alterar a nota parcial:" +
                                        "(digite 0 para voltar ao menu inicial):" + sb));
                    busca = false;

                } catch (NumberFormatException nexc){
                    JOptionPane.showMessageDialog(null, "Número inserido inválido!");
                }
            } while (busca);
            
            if (c != 0){
                if (c > 0 && c < 21){
                    disciplinas[c].setNotaParcial(JOptionPane.showInputDialog("Insira a nova nota parcial da disciplina " +
                                            disciplinas[c].getDisciplina() + "(0 - 10):"));
                }
            }
        }
    }
    
    @Override
    public String toString (){
        StringBuilder sb = new StringBuilder();
        
        for (int c = 0; c < disciplinasCadastradas; c++){
            sb.append(disciplinas[c].getDisciplina()).append("\n");
            sb.append("Nota Parcial: ").append(disciplinas[c].getNotaParcial()).append("\n");
            sb.append("Nota Final:").append(disciplinas[c].getNotaFinal()).append("\n");
        }
        
        return  "NOME:" + this.getNome() + "\n" +
                "CÓDIGO:" + this.getCodigo() + "\n" +
                "CURSO: " + this.getCurso() + "\n" +
                "Disciplinas cursadas:\n" + sb + "\n";
    }

   
    
    
    
    
    
    
}
