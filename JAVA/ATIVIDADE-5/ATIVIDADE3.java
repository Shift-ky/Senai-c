import java.util.Scanner;

/*03. Crie um algoritmo leia um número do usuário e exiba a sua tabuada de multiplicação.
*/
public class ATIVIDADE3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        System.out.print("Digite um numero para ver a sua taboada: ");
        num = entrada.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.printf("%2d X %2d = %3d",num,i,i*num);
        }
        entrada.close();

    }
}
