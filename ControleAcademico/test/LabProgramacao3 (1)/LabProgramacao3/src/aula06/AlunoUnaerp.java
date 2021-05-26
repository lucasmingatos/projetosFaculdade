package aula06;

public class AlunoUnaerp extends Aluno {

    public AlunoUnaerp(int codigo, String nome, double nota1, double nota2) {
        super(codigo,nome,nota1,nota2);
    }    
    
    @Override
    public double getMedia(){
        return (getNota1()*0.40+getNota2()*0.60);
    }

    @Override
    public String toString() {
        return "UNAERP " + super.toString();
    }
    
}
