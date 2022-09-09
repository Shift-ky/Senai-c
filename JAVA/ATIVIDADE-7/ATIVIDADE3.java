import java.util.Scanner;

 /* 03. Crie uma matriz de double e retorna o maior valor da matriz.*/
public class ATIVIDADE3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double maior = 0;

        System.out.print("Informe a quantidade de colunas: ");
        int a = entrada.nextInt();

        System.out.print("Informe a quantidade de linhas: ");
        int b = entrada.nextInt();

        double[][] numeros = new double[a][b];
        int soma = 0;
        for(int i = 0; i <numeros.length; i++){
            for (int j = 0; j < numeros.length; j++){
                System.out.printf("Informe o valor para a matriz[%d][%d]: ",i+1,j+1);
                numeros[i][j] = entrada.nextDouble();
            }
        }
        for(int i = 0; i <numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if(i == 0 || numeros[i][j] > maior){
                    maior = numeros[i][j];
                }
                System.out.printf("\t[%3.2f]\t",numeros[i][j]);

            }
            System.out.println();
        }
        System.out.println("O maior valor digitado é: "+maior);

        entrada.close();
    }

}

