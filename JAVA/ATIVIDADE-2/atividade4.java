import java.util.Scanner;

/*04. Faça um programa em Java que calcule o valor de uma prestação em atraso. Para isso, o programa deve ler o valor
da prestação vencida, a taxa periódica de juros e o período de atraso. Ao final, o programa deve imprimir o valor da
prestação atrasada, o período de atraso, os juros que serão cobrados pelo período de atraso, o valor da prestação
acrescido dos juros. Considere juros simples.
*/
public class atividade4 {
    public static void main(String[] args) {

        double prestacao, taxa, Vtaxa;
        int periodo;

        Scanner entrada = new Scanner(system.in);

        System.out.print("Digite o valor da pretação: ");
        prestacao = entrada.nextDouble();

        System.out.print("Digite a taxa de juros: ");
        taxa = entrada.nextDouble();

        System.out.print("Quantos dias de atraso: ");
        periodo = entrada.nextInt();

        Vtaxa = (prestacao*taxa)/100;
        entrada.close();

        System.out.printf("O valor da pretaç]ao %.2f\n",prestacao);
        System.out.printf("PERIODO DE ATRASO %d DIAS",periodo);
        System.out.printf("O valor da taxa de juros cobrado é: %.2f\n",Vtaxa*periodo);
        System.out.printf("O valor da prestaç]ao vai ficar: %.2f\n",prestacao+(Vtaxa*periodo));
        

    }
}
