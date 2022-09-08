import java.util.Scanner;

/*02. Sabendo-se que na lista oficial de cada país consta, além de outros dados, peso e idade de 3 jogadores, crie um programa que apresente as seguintes informações:
• O atleta mais pesado do time;
• O atleta mais jovem do time;
• O peso médio e a idade média de todos os participantes do time.
*/
public class ATIVIDADE2 {
    public static void main(String[] args) {

        double peso, pesoMaior= 0, pesoMedio = 0;
        int idade, idadeMedia = 0, jogadorMaisJovem = 0;

        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.print("Digite o peso: ");
            peso = entrada.nextDouble();

            System.out.print("Digite a idade: ");
            idade = entrada.nextInt();

            if(peso > pesoMaior){
                pesoMaior = peso;
            }
            if(i == 1 || idade < jogadorMaisJovem){
                jogadorMaisJovem = idade;
            }
            pesoMedio += peso;
            idadeMedia += idade;
        }
        System.out.printf("Media dos pesos: %.2f\n",pesoMedio/3);
        System.out.printf("Media de idade: %d\n",idadeMedia/3);
        System.out.printf("Jogador mais pesado: %.2f",pesoMaior);
        System.out.printf("Jogador mais jovem: %d\n",jogadorMaisJovem);
        entrada.close();
    }
}
