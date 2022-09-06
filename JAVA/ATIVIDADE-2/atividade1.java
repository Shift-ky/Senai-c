/*01. Questão da média;*/

import java.util.Locale;
import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3, media;
        String nome;

        System.out.print("Digite o nome do aluno: ");
        nome = entrada.nextLine().strip().toLowerCase();

        System.out.print("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3)/3;

        System.out.printf("O aluno %s ficou com",nome);
        System.out.printf("A media %.1f e está: ",media);

        if(media <= 4){
            System.out.println("REPROVADO");
        } else if(media < 7){
            System.out.print("RECUPERAÇÃO");
        } else{
            System.out.println("APROVADO");
        }
        entrada.close();

    }
}
