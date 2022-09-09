import java.util.Scanner;

/*02. Crie uma matriz de inteiros e retorna a soma de todos os elementos da matriz.
*/
public class ATIVIDADE2 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       System.out.print("Informe a quantidade de colunas: ");
       int a = entrada.nextInt();

       System.out.print("Informe a quantidade de linhas: ");
       int b = entrada.nextInt();

       int[][] numeros = new int[a][b];
       int soma = 0;
       for(int i = 0; i <numeros.length; i++){
           for (int j = 0; j < numeros.length; j++){
               System.out.printf("Informe o valor para a matriz[%d][%d]: ",i+1,j+1);
               numeros[i][j] = entrada.nextInt();
               soma += numeros[i][j];
           }
       }
       System.out.println("A soma dos valores é: "+soma);
       entrada.close();
    }

}
