package atividadeExtra;

import java.util.Scanner;

/**
 *
 * @author RobsonPaiva
 */
public class Teste {
    //Função para poer mostra se o aluno foi aprovado ou reprovado
    
    public static String converter(boolean x){
        String resultado;
        
        if(x != true){
            resultado = "REPROVADO";
        }else{
            resultado = "APROVADO";
        }
        
        return resultado;
    }

   public static void main(String[] args) {
       
       // Criando os objetos
     Scanner entrada = new Scanner(System.in);
     Curso curso = new Curso();
     Aluno aluno = new Aluno();
     double[] notas = new double[4];
     
     
     //Colocando as informações do curso 
       System.out.print("DIGITE O NOME DO CURSO: ");
       String nomeCurso = entrada.nextLine();
       curso.setNome(nomeCurso);
       
       
       System.out.print("Informe a descrição do curso: ");
       String descricao = entrada.nextLine();
       curso.setDescricao(descricao);
       
       System.out.println("Quantos professores contém o curso: ");
       String quan = entrada.nextLine();
       int quant = Integer.parseInt(quan);
       Professor[] professores = new Professor[quant];
       
       // Colocando os dados dos professores
       
       for (int i = 0; i < professores.length; i++) {
           Professor professor = new Professor();
           
           System.out.printf("Digite o nome do %dº professor: ",i+1);
           String nomeProfessor = entrada.nextLine();
           professor.setNome(nomeProfessor);
           
           System.out.print("Digite o CPF do professor: ");
           String cpf = entrada.nextLine();
           professor.setCpf(cpf);
           
           System.out.print("Digite o endereço do professor: ");
           String endereco = entrada.nextLine();
           professor.setEndereco(endereco);
           
           System.out.print("Digite o telefone do professor: ");
           String telefone = entrada.nextLine();
           professor.setTelefone(telefone);
           
           System.out.print("Digite o departamento: ");
           String departamento = entrada.nextLine();
           professor.setDepartamento(departamento);
           
           System.out.print("Digite o salario do professor: ");
           String aux = entrada.nextLine();
           double salario = Double.parseDouble(aux);
           professor.setSalario(salario);
           professores[i] = professor;
       }
       curso.setProfessor(professores);
       
       //Colocando os dados no aluno
       
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = entrada.nextLine();
        aluno.setNome(nomeAluno);
           
        System.out.print("Digite o CPF do Aluno: ");
        String cpfAluno = entrada.nextLine();
        aluno.setCpf(cpfAluno);
           
        System.out.print("Digite o endereço do Aluno: ");
        String enderecoAluno = entrada.nextLine();
        aluno.setEndereco(enderecoAluno);
           
        System.out.print("Digite o telefone do Aluno: ");
        String telefoneAluno = entrada.nextLine();
        aluno.setTelefone(telefoneAluno);
        
         for(int i = 0; i < notas.length; i++){  //Laço de repetição para pegar as 4 notas do aluno
           
           System.out.printf("Digite a %dº nota do aluno: ",i+1);
           String aux = entrada.nextLine();
           double nota = Double.parseDouble(aux);  // Converter a string recebida para double
          
           notas[i] = nota; // Inserindo as notas no vetor
       }
       aluno.setNotas(notas); // Inserindo as notas dentro da classe aluno
         boolean opc = false;
       while (opc != true){  //Laço de repetição do menu para saída de dados
           
           System.out.println("[1] - INFORMAÇÃO DO CURSO \n[2] - INFORMAÇÃO DOS PROFESSORES \n[3] - INFORMAÇÕES DO ALUNO \n[4] - SAIR");  // Menu que vai se mostrado na tela para selecionar uma opção
           int opc1 = entrada.nextInt();
           
           switch (opc1) {
               case 1 -> {
                   System.out.println("==============================================\n");
                   System.out.println(curso.exibirInformacao());
                   System.out.println("==============================================\n");
             }
                   
               case 2 -> {
                   System.out.println("==============================================\n");
                   System.out.println(curso.mostrarProfessor());
                   System.out.println("==============================================\n");
             }
                   
               case 3 -> {
                   boolean x;
                   x = aluno.verificarAprovado();
                   System.out.println("==============================================\n");
                   System.out.print(aluno.toString()+ converter(x)+"\n\n");
                   System.out.println("==============================================\n");
             }
                   
               case 4 -> opc = true;
           }
       }
     
    }
   
}