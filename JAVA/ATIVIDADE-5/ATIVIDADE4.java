import java.util.Scanner;

/*04. Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números. Encerre a execução quando um número negativo for digitado*/
public class ATIVIDADE4 {
    public static void main(String[] args) {
    int numero,soma = 0;

    Scanner entrada = new Scanner(System.in);
    do {
        System.out.println("Digite um valor ou digite algum valor neggativo para sair \n -> ");
        numero = entrada.nextInt();

        if(numero >= 0){
            soma += numero;
        }
    }while(numero >= 0);
    System.out.println("O valor da soma dos números digitados é"+ soma);

    }
}
