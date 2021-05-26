package controleacademico;

import javax.swing.JOptionPane;

public class DisciplinaAlunos {
    
    public String disciplina;
    public String notaFinal;
    public String notaParcial;
    
    public DisciplinaAlunos(){
        
        this.notaParcial = "Sem registros de nota parcial";
        this.notaFinal = "Sem registros de nota final";
        this.disciplina = "Sem registro de disciplinas";
        
    }
    
    public DisciplinaAlunos(String notaParcial, String notaFinal) {
        this.notaParcial = notaParcial;
        this.notaFinal = notaFinal;
    }
    
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    public String getDisciplina() {
        return this.disciplina;
    }
    
    public void setNotaParcial(String notaParcial) {
        boolean busca = true;
        
        do{
            try{

                Double.parseDouble (notaParcial);
                busca = false;

            } catch (NumberFormatException num){
                 notaParcial = setNotaParcial();
            }
        } while (busca);
        
        if (Double.parseDouble (notaParcial) <= 10 && Double.parseDouble (notaParcial) >= 0.0){
            this.notaParcial = notaParcial;
        }
    }
    
    private String setNotaParcial (){
        JOptionPane.showMessageDialog(null, "Nota Parcial Inválida!");

        return JOptionPane.showInputDialog("Insira a nota parcial:");
    }
    
    public String getNotaParcial() {
        return this.notaParcial;
    }
    
    public void setNotaFinal(String notaFinal) {
        boolean busca = true;
        
        do{
            try{

                Double.parseDouble (notaFinal);
                busca = false;

            } catch (NumberFormatException num){
                 notaFinal = setNotaFinal();
            }
        } while (busca);
        
        if (Double.parseDouble (notaFinal) <= 10 && Double.parseDouble (notaFinal) >= 0.0){
            this.notaFinal = notaFinal;
        }
    }
    
    private String setNotaFinal(){
        JOptionPane.showMessageDialog(null, "Nota Final Inválida!");

        return JOptionPane.showInputDialog("Insira a nota final:");
    }
    
    public String getNotaFinal() {
        return this.notaFinal;
    }
    
    public String getMedia (){
        if ("Sem registros de nota parcial".equals (this.notaParcial) && "Sem registros de nota final".equals(this.notaFinal)){
            return "Sem registros de nota no sistema";
        } else if ("Sem registros de nota no sistema".equals (this.notaParcial)){
            return "Sem registros de nota  parcial no sistema";
        } else if ("Sem registros de nota no sistema".equals (this.notaFinal)){
            return "Sem registros de nota final no sistema";
        } else{
            return String.format("%.1f", 
                            Double.parseDouble (this.notaParcial)*0.4 +
                            Double.parseDouble (this.notaFinal)*0.6);
        }
    }

    
}
