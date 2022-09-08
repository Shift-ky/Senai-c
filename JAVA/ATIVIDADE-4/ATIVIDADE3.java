import java.util.Scanner;

/*03. Construa um programa em Java que leia vários números, informe quantos números entre 50 e 100 foram digitados e quantos são ímpares. Pergunte se o usuário deseja continuar, senão o programa deve encerrar a execução.
*/
public class ATIVIDADE3 {
    public static void main(String[] args) {

        int opc, cont = 0, contImpar=0;
        Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("Digite um valor ou 0 para sair -> ");
            opc = entrada.nextInt();

            if(opc >= 50 && opc <= 100){
                if(opc %2 != 0){
                    contImpar++;
                }
                cont++;
            }
        }while(opc != 0);
        System.out.printf("Foram digitados %d numeros entre 50 e 100\n",cont);
        System.out.printf("Entre 50 e 100 foram digitados %d numeros impares",contImpar);
        entrada.close();
    }
}
