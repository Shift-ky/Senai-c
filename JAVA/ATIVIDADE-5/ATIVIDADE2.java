import java.util.Scanner;

/*02. Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.
*/
public class ATIVIDADE2 {
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
