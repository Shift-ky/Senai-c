import java.util.Scanner;

/*02. Faça um programa em Java que leia o nome o endereço e o telefone de um cliente e ao final, imprima esses dados.
*/
public class atividade2 {
    public static void main(String[] args) {
        String nome, endereco, telefone;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite o seu endereço: ");
        endereco = entrada.nextLine();

        System.out.print("Digite o seu telefone: ");
        telefone = entrada.nextLine();

        System.out.printf("NOME: %s \nENDEREÇO: %s \n TELEFONE: %s",nome,endereco,telefone);


        entrada.close();
    }
}
