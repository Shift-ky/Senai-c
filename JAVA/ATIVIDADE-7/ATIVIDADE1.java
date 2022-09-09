import java.util.Scanner;

/*01. Capture do teclado valore para o preenchimento de uma matriz M 3x3. Após a captura imprima a matriz criada e encontre a quantidade de números pares e a quantidade de números ímpares.
*/
public class ATIVIDADE1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] m = new int[3][3];
        int contPar = 0, contImpar = 0;

        for (int i = 0; i < 3 ; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf("Digite o valor para a matriz[%d][%d]: ",i+1,j+1);
                m[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i <m.length; i++){
            for (int j = 0; j <m.length; j++){
                System.out.printf("\t[%3d]\t",m[i][j]);
                if (m[i][j] %2 == 0){
                    contPar++;
                }else{
                    contImpar++;
                }
            }
            System.out.println();
        }
        System.out.println("Foram digitados "+contPar+" Numeros pares");
        System.out.println("Foram digitados "+contImpar+"Numeros impares");

        entrada.close();

    }
}
