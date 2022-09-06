import java.util.Scanner;

/*05. Faça um programa em Java que leia dois valores numéricos inteiros e efetue a adição, caso o resultado seja maior
 que 10, apresentá-lo.*/
public class atividade5 {
    public static void main(String[] args) {
        int numero1,numero2,soma;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextInt();

        soma = numero1 + numero2;

        if(soma > 10){
            System.out.printf("O soma foi maior que 10: soma -> %d",soma);
        } else{
            System.out.printf("A soma foi menor que 10: soma ->  %d",soma);
        }

        entrada.close();
    }
}
