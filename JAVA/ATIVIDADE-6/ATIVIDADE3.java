import java.util.Scanner;

/*03. Desenvolva um programa que leia 10 salários, armazene num vetor (double) e depois percorra esse vetor identificando qual o índice do maior salário.
*/
public class ATIVIDADE3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] array = new double[10];
        double maior = 0;
        int indice = 0;

        for(int i = 0; i < array.length; i++){
            System.out.printf("Digite o valor do %dº salario: ",i+1);
            array[i] = entrada.nextDouble();
        }
        for(int i = 0; i < array.length; i++){
            if(i == 1|| array[i] > maior){
                maior = array[i];
                indice = i;
            }
        }
        System.out.println("O maior salário digitado foi: "+maior);
        System.out.println("E o seu indice no vetor é: "+indice);
        entrada.close();
    }

}
