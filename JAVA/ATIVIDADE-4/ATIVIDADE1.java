import java.util.Scanner;

/*01. Crie um programa em linguagem Java que permita entrar com a nota da prova 1 e da prova 2 de 15 alunos. Ao final, imprimir uma listagem, contendo: nota da prova 1, nota da prova 2, a média das notas de cada aluno e a situação final de cada. Ao final, imprimir a média geral da turma.
*/
public class ATIVIDADE1 {
    public static void main(String[] args) {

        double nota1,nota2,media;

        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.print("Digite a primeira nota: ");
            nota1 = entrada.nextDouble();

            System.out.print("Digite a segunda nota: ");
            nota2 = entrada.nextDouble();

            media = (nota1 + nota2)/2;

            System.out.println("======================================================");
            System.out.printf("ALUNO %d\n",i+1);
            System.out.printf("NOTA 1 %.1f\n",nota1);
            System.out.printf("NOTA 2 %.1f\n",nota2);
            System.out.printf("MEDIA = %.2f\n",media);
        }

        entrada.close();
    }
}
