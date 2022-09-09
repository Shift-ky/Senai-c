import java.util.Scanner;

/*01. Desenvolva um programa que leia 10 nomes, armazene num vetor (de Strings) e depois percorra esse vetor escrevendo os nomes presentes nele.
*/
public class ATIVIDADE1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um valor: ");
            numero = entrada.nextInt();

            soma += numero;
        }
        System.out.printf("A soma dos valores é %d",soma);

        entrada.close();

    }
}
