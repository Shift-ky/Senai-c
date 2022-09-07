/*01. Faça um programa em Java que leia um número e informe se ele é divisível por 3 e por 7.
*/

public class atividade1{
    public static void main(string[] args){
        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        numero = entrada.nextInt();

        if(numero % 3 == 0 and numero % 3 == 0){
            System.out.print("O valor digitado é divisível por 3 e 7");
        }else{
            System.out.prinln("O valor digitado não é divisível por 3 e 7");
        }

        entrada.close();
    }
}