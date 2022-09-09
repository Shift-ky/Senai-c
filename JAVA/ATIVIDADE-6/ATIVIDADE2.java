import java.util.Scanner;

/*02. Desenvolva um programa que leia 10 idades, armazene num vetor (int) e depois percorra esse vetor calculando a média das idades.
*/
public class ATIVIDADE2 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int[] array = new int[10];
       double mediaIdade = 0;

       for(int i = 0; i < array.length; i++){
           System.out.printf("Digite a %dº idade: ",i+1);
           array[i] = entrada.nextInt();

           mediaIdade += array[i];
       }
       System.out.println("Media das idades = "+mediaIdade/10);
       entrada.close();
    }

}
