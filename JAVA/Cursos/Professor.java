/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeExtra;

/**
 *
 * @author famil
 */
public class Professor extends Pessoa {
    private String departamento;
    private String nomeCurso;
    private double inss = 0;
    private double salario;

    public String getDepartamento() {
        return departamento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public double getSalario() {
        return salario;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularSalarioLiquido(){
        double salarioFinal = 0;
        this.inss = this.inss/100;
        
        salarioFinal = this.salario * inss;
        
        return this.salario - salarioFinal ;
    }
    
    
}
