package AgenciaBancaria;

import java.util.Scanner;

public class poo {
	public static void main(String[] args) {
		float deposito,saque;
		String saida = "n";
		Scanner entrada = new Scanner(System.in);
		
		ContaBancaria conta = new ContaBancaria();
		
		System.out.println("==================================");
		System.out.println("========== BANCO SANTER ==========");
		System.out.println("==================================");
		
		System.out.println();
		
		do {
			System.out.println("INFORME A SUA OPçãO");
			System.out.println("[1] - DEPOSITAR \n[2] - SACAR \n[3] - SALDO EM CONTA \n[4] - SAIR \n-> ");
			int opc1 = entrada.nextInt();
			
			switch (opc1) {
			case 1:
				System.out.println("Digite o valor de depósito: ");
				deposito = entrada.nextFloat();
				if(deposito < 0) {
					System.out.println("Saldo inválido");
				}else {
					conta.depositar(deposito);
				}
				
				
				break;
			case 2:
				System.out.println("Informe o valor de saque: ");	
				saque = entrada.nextFloat();
				
				conta.sacar(saque);
							
				break;
			case 3:
				System.out.printf("Saldo da conta: R$%.2f",conta.saldo);
				System.out.printf("\n\tSaldo especial R$ %.2f\n",conta.limite);
				break;
			case 4:
				
				saida = "s";
				break;
			default: System.out.println("Opção inválida");
				break;
			}
			
			
		} while(saida.equals("n"));
		
		
		entrada.close();
	}

}
