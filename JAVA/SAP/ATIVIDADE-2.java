/*02. Faça um programa que sorteie um número aleatório entre 0 e 500 e pergunte ao usuário qual é o "número mágico". O programa deverá indicar se a tentativa efetuada pelo usuário é
maior ou menor que o número mágico e contar o número de tentativas. Quando o usuário conseguir acertar o número o programa deverá classificar o usuário como:
a. De 1 a 3 tentativas: muito sortudo
b. De 4 a 6 tentativas: sortudo
c. De 7 a 10 tentativas: normal
d. > 10 tentativas: tente novamente*/

import java.util.Random;
import java.util.Scanner;

public class atividade2 {
public static void main(String[] args) {
	
	
		Scanner entrada = new Scanner(System.in);
		int jogador,computador,cont =0;
		
		Random random = new Random();
		
		computador = random.nextInt(500);
		System.out.println(computador);
		
		do {
			cont++;
			System.out.println("Adivinhe o numero que o computador escolheu de 0 a 500: ");
			jogador = entrada.nextInt();
			System.out.println(jogador);
			
			if(jogador == computador) {
				System.out.println("PARABENS VOCE ACERTOU");
				
			}else if (computador > jogador) {
				System.out.println("VISH... O VALOR E MAIOR");
				
			}else
			
				System.out.println("VISH... O VALOR E MENOR");
			
		} while (computador != jogador);

		if(cont >= 1 && cont <=3) {
			System.out.println("MUITO SORTUDO");
		}else if(cont >= 4 && cont <=6) {
			System.out.println("SORTUDO");
		}else if(cont >= 7 && cont <=10) {
			System.out.println("NORMAL");
			
		} else {
			System.out.println("TENTE NOVAMENTE");
		}
		
		
		entrada.close();
	}

}