/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeExtra;

/**
 *
 * @author famil
 */
public class Aluno extends Pessoa{
    private String curso;
    private double[] notas;
    
   // Aluno(String nome, String cpf, String curso){
    //    super(nome, cpf);
     //   this.curso = curso;
    //}

//Aluno (){
    
//}
    /**
     * @return the cursos
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the cursos to set
     */
    public void setCursos(String curso) {
        this.curso = curso;
    }

    /**
     * @return the notas
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
   public double calularMedia(){
       double media = 0;
       for(int i = 0; i < notas.length; i ++){
           media += this.notas[i];
       }
       return media/4;
   }
   
   public boolean verificarAprovado(){
       boolean aprovado = false;
       if(calularMedia() >=7){
           aprovado = true;
       }
       
       return aprovado;
   }   

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        String aux = "";
        aux = "\nNOME DO ALUNO: " + this.getNome()+
              "\nTELEFONE: " + this.getTelefone()+
              "\nCURSO MATRICULADO: "+ this.curso + 
              "\nNOTAS\n";
              for(int i = 0; i < notas.length; i++){
                  aux += i+1+"º NOTA: "+ notas[i]+"\n";
              }
              aux += "MEDIA DO ALUNO: " + calularMedia()+
                      "\nSITUAÇÃO DO ALUNO: ";
        return  aux;
    }
    
}
