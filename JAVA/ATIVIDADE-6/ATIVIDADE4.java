import java.util.Scanner;

/*04. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a multiplicação dos respectivos elementos em A e B, ou seja: C[i] = A[i] * B[i]. Observação: mostre quais desses número do vetor C são múltiplos de 3.
 */
public class ATIVIDADE4 {

    public static void main(String[] args) {


    Scanner entrada = new Scanner(System.in);
    int[] a = new int[10], b = new int[10], c = new int[10];

    for(int i = 0; i < a.length; i++){
        System.out.printf("Digite o %dº valor para o vetor a: ",i+1);
        a[i] = entrada.nextInt();
    }
        for(int i = 0; i < b.length; i++){
            System.out.printf("Digite o %dº valor para o vetor b: ",i+1);
            b[i] = entrada.nextInt();

            c[i] = a[i] * b[i];
        }
        System.out.println("Valores do vetor c que são multiplos de 3");
        for (int i = 0; i < c.length; i++){
            if(c[i] %3 == 0){
                System.out.println(c[i]);
            }
        }
    entrada.close();

    }
}
