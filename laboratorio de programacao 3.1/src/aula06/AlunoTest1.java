/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author lucas
 */
public class AlunoTest1 {
    
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno (123456, "joão da silva", 10.0,8.0);
        AlunoUnaerp a2 = new AlunoUnaerp (123456, "joão da silva", 10.0,8.0);
        AlunoUnaerpLabProgramacao03 a3 = new AlunoUnaerpLabProgramacao03 (123456, "joão da silva", 10.0,8.0);
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
    
}
