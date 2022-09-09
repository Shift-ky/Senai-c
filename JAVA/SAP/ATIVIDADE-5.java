/*05. Escreva um algoritmo que simule o funcionamento de um caixa de supermercado. O seu algoritmo deve
receber do a informação de quantos produtos o cliente comprou e, para cada produto, deverá ler o seu preço.
Ao final, deverá informar quanto o cliente deve pagar pelas compras.*/

[21373] LÓGICA DE PROGRAMAÇÃO
21373
SAP Java
import java.util.Scanner;

public class atividade5 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opc;
		String produto;
		double preco,quantidade;
		double valor =0,valorTotal=0;
		
		System.out.println("===========================================");
		System.out.println("========== SUPERMERCADO SEM NOME ==========");
		System.out.println("===========================================");
		
		do {

			System.out.println("PRODUTO: ");
			produto = entrada.next();
			
			System.out.println("Qual o preço do produto: ");
			preco = entrada.nextDouble();
			
			System.out.println("Qual a quantidade: ");
			quantidade = entrada.nextDouble();
			
			System.out.println("Quer continuar [1] - sim  [2] nao: ");
			opc=entrada.nextInt();
			valor = preco*quantidade;
			valorTotal += valor; 
		} while (opc != 2);
		
		System.out.printf("O valor a ser pago é: R$%.2f",valorTotal);
		
		
		
		entrada.close();
	}

}
