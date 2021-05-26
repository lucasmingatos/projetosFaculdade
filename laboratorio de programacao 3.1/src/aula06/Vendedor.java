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
public class Vendedor extends Funcionario{
    
    private double totalvendas;
    
    public Vendedor(){
        
    }

    public Vendedor(String nome, double salario, double totalvendas) {
        super(nome, salario);
        this.totalvendas = totalvendas;
    }

    public double getTotalvendas() {
        return totalvendas;
    }

    public void setTotalvendas(double totalvendas) {
        this.totalvendas = totalvendas;
    }
    
    

    @Override
    public String getNome() {
        return super.nome + " (VENDEDOR) "; 
    }

    @Override
    public double getSalario() {
        return super.salario + (getTotalvendas()*0.05);
    }
    
}
