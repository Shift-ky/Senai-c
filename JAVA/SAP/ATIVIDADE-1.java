/*01. Faça um programa que receba do usuário o número de lados e o tamanho dos lados de um polígono regular e imprima o valor da área do polígono. O programa deve utilizar uma
estrutura switch-case para decidir que fórmula de cálculo utilizar, de acordo com o número de lados do polígono. Se o número de lados for diferente de 3, 4 ou 6 o programa deve
informar: “não sei calcular a área”. Áreas: (2 pontos)
a. Triângulo: A = L*L*1.73/4
b. Quadrado: A = L*L
c. Hexágono: A = 6*L*L*1.73/4;*/

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		double lado,area;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("qual poligono voce quer calcular: \nDigite 1 para 3 Lado \nDigite 2 para 4 lados\nDigite 3 para 6 lados\n ->  ");
		int opc = entrada.nextInt();
		
		switch (opc) {
		case 1:
			System.out.println("Digite o valor de um dos lados do triangulo: ");
			lado = entrada.nextDouble();			
			area = lado * lado*1.73/4;
			System.out.println("A area do triangulo é: "+area);
			break;
		case 2:
			System.out.println("Digite o valor de um dos lados do quadrado: ");
			lado = entrada.nextDouble();			
			area = lado * lado;
			System.out.println("A area do quadrado é: "+area);
			break;
		case 3:
			System.out.println("Digite o valor de um dos lados do hexagono: ");
			lado = entrada.nextDouble();			
			area = 6 * lado * lado*1.73/4;
			System.out.println("A area do hexagono é: "+area);
			break;
		default:
			System.out.println("Não sei calcular a area");
			break;
		}
		
		
		entrada.close();
	}
}