import java.util.Scanner;

/*04. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a multiplicação dos respectivos elementos em A e B, ou seja: C[i] = A[i] * B[i]. Observação: mostre quais desses número do vetor C são múltiplos de 3.
*/
public class ATIVIDADE4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Ms jogo = new Ms();
        String posicao;
        int valida = 0, Jogadas = 0;

        while(true) {
        System.out.println("+++++Jogo Da Velha+++++");
        jogo.Mostrar();

        do {//inicia o primeiro jogador
        System.out.print("Jogador 1, informe a posição: ");
        posicao = ler.next();
        while(!jogo.Valido(posicao)) {
        System.out.println("Jogada Invalida, Escolha Outra Posição!!!");
        System.out.print("Jogador 1, informe a posição: ");
        posicao = ler.next();
        valida = 0;
        }
        jogo.jogada(posicao, "X");
        valida = 1;


        }while(valida == 0);//fim primeiro jogador

        Jogadas++;
        valida = 0;
        jogo.Mostrar();
        if(!jogo.Ganhou(Jogadas).equals("null")) {
        break;
        }

        do {//inicia o segundo jogador
        System.out.print("Jogador 2, informe a posição: ");
        posicao = ler.next();
        while(!jogo.Valido(posicao)) {
        System.out.println("Jogada Invalida, Escolha Outra Posição!!!");
        System.out.print("Jogador 2, informe a posição: ");
        posicao = ler.next();
        valida = 0;
        }
        jogo.jogada(posicao, "O");
        valida = 1;

        }while(valida == 0);//fim segundo jogador

        Jogadas++;
        valida = 0;
        jogo.Mostrar();
        if(!jogo.Ganhou(Jogadas).equals("null")) {
        break;
        }

        }
        System.out.println("O "+jogo.Ganhou(Jogadas)+" Venceu!");


        }
}
