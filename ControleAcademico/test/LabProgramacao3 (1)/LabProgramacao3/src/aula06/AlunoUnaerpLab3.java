/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author prodrigo
 */
public class AlunoUnaerpLab3 extends AlunoUnaerp {

    private double nota3;
    
    public AlunoUnaerpLab3(int codigo, String nome, double nota1, double nota2, double nota3) {
        super(codigo, nome, nota1, nota2);
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    @Override
    public double getMedia() {
        return (getNota1() * 0.40 + getNota2() * 0.40 + getNota3() * 0.20);
    }

    @Override
    public String toString() {
        return "UNAERP LAB III " + super.toString();
    }    
    
}
