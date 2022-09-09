/*04.Faça um programa que, dados dois arrays bidimensionais (matrizes A e B) com dimensões de no máximo 5x5 elementos, retorne:
a. a soma destas duas matrizes
b. a soma das diagonais de cada matriz
c. a multiplicação das duas matrizes*/

import java.util.Scanner;

public class atividade4 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int[][] matA = new int[5][5];
		int[][] matB = new int[5][5];
		
		for (int i = 0; i < matB.length; i++) {
			for (int j = 0; j < matB.length; j++) {
				System.out.printf("Digite o valor da matriz[%d][%d] ",i,j);
				matA[i][j] = entrada.nextInt();
			}
			
		}
		// entrada de dados
		for (int i = 0; i < matB.length; i++) {
			for (int j = 0; j < matB.length; j++) {
				System.out.printf("Digite o valor da matriz[%d][%d] ",i,j);
				matB[i][j] = entrada.nextInt();
			}
			
		}
		// Imprime a MATRIZ A
		
		System.out.println("\nMATRIZ A \n");
		for (int i = 0; i < matB.length; i++) {
			for (int j = 0; j < matB.length; j++) {
				System.out.printf("[%3d]",matA[i][j]);
			}
			System.out.println();
			
		}
		
		//Imprime a MATRIZ B
		System.out.println("\nMATRIZ B\n");
		for (int i = 0; i < matB.length; i++) {
			for (int j = 0; j < matB.length; j++) {
				System.out.printf("[%3d]",matB[i][j]);
			}
			System.out.println();
			
		}
		// Imprime a Soma
		System.out.println("\nSOMA\n");
		for (int i = 0; i < matB.length; i++) {
			for (int j = 0; j < matB.length; j++) {
				System.out.printf("[%3d]",matA[i][j]+matB[i][j]);
			}
			System.out.println();
			
		}
		// Imprime a multiplicação
		System.out.println("\nMULTIPLICAÇÂO\n");
		for (int i = 0; i < matB.length; i++) {
			for (int j = 0; j < matB.length; j++) {
				System.out.printf("[%4d]",matA[i][j]*matB[i][j]);
			}
			System.out.println();
			
		}
		// Imprime asoma da diagonal
		
		System.out.println("\nSOMA DIAGONAIS\n");
		for (int i = 0; i < matB.length; i++) {
			for (int j = 0; j < matB.length; j++) {
				if(i ==j || i + j == 4) {
					System.out.printf("[%3d]",matA[i][j]+matB[i][j]);
				} else {
					System.out.printf("[  0]");
				}
				
			}
			System.out.println();
			
		}
		
		
		
		
		entrada.close();
	}

}