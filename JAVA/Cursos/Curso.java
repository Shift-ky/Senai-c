/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeExtra;

import java.util.Arrays;

/**
 *
 * @author famil
 */
public class Curso {
    public String nome;
    public String descricao;
    Professor[] professor;

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Professor[] getProfessor() {
        return professor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setProfessor(Professor[] professor) {
        this.professor = professor;
    }
  
    public String exibirInformacao(){
        return toString();
    }

    @Override
    public String toString() {
        String profesor = "";
        for(int i = 0; i < professor.length; i++){
            profesor +="PROFESSOR: "+ professor[i].getNome() + ".\n";
        }
        return "NOME DO CURSO: " + nome + ",\nDESCRIÇÃO DO CURSO: " + descricao + "\n" +"PROFESSORES DO CURSO \n"+ profesor;
    }
    
    public String mostrarProfessor(){
        String aux = "";
        for(int i = 0; i < professor.length; i++){
            aux += "NOME DO PROFESSOR: " + professor[i].getNome()+
                  "\nTELEFONE: "+ professor[i].getTelefone()+
                  "\nDEPARTAMENTO: "+ professor[i].getDepartamento()+
                  "\nSALARIO: R$"+ professor[i].calcularSalarioLiquido()+"\n\n";
        }
        return aux;
    }

   
    
    
}
