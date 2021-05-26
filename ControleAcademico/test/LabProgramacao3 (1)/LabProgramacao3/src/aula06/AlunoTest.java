package aula06;

public class AlunoTest {
    
    
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno(123456, "João da Silva",10.0,8.0);
        AlunoUnaerp a2 = new AlunoUnaerp(123456, "Ana Maria",10.0,8.0);
        AlunoUnaerpLab3 a3 = new AlunoUnaerpLab3(
                123456, "José Antônio",10.0,8.0,9.2);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
