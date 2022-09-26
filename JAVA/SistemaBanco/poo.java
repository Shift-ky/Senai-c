package AgenciaBancaria;

import java.util.Scanner;

public class poo {
	public static void main(String[] args) {
		float deposito,saque;
		String saida;
		Scanner entrada = new Scanner(System.in);
		
		ContaBancaria conta = new ContaBancaria();
		
		System.out.println("==================================");
		System.out.println("========== BANCO SANTER ==========");
		System.out.println("==================================");
		
		System.out.println();
		
		do {
			System.out.println("INFORME A SUA OP��O");
			System.out.println("[1] - DEPOSITAR \n[2] - SACAR \n[3] - SALDO EM CONTA \n[4] - SAIR \n-> ");
			int opc1 = entrada.nextInt();
			
			switch (opc1) {
			case 1:
				System.out.println("Digite o valor de dep�sito: ");
				deposito = entrada.nextFloat();
				if(deposito < 0) {
					System.out.println("Saldo inv�lido");
				}else {
					conta.depositar(deposito);
				}
				
				
				break;
			case 2:
				System.out.println("Informe o valor de saque: ");	
				saque = entrada.nextFloat();
				
				if(saque < 0 || saque > conta.saldo) {
					System.out.println("Saldo insuficiente!");
				}else {
					conta.sacar(saque);
					System.out.println("Valor sacado com sucesso!");
				}
							
				break;
			case 3:
				System.out.printf("Saldo da conta: R$%.2f",conta.saldo);
				break;
			case 4:
				
				saida = "s";
				break;
			default: System.out.println("Op��o inv�lida");
				break;
			}
			
			System.out.println("\nQuer realizar outra fun��o [s/n]? ");
			saida = entrada.next().toLowerCase();
			
		} while(saida.equals("s"));
		System.out.println("Obrigado pela prefer�ncia...\nVolte sempre!");
		
		
		entrada.close();
	}

}
