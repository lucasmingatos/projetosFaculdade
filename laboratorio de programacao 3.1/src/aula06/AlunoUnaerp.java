package aula06;


public class AlunoUnaerp {
    
    @Override
    public double getMedia(){
        return(getNota1() * 0.40 + getNota2() * 0.60);
    }
    
}
