import java.util.Scanner;

public class atividade {
	
	public static void main(String[] args) {
		
		int opc = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha uma atividade");
		System.out.printf("[1] - Atividade 1 \n[2] - Atividade 2 \n"
		+ "[3] - Atividade 3 \n[4] - Atividade 4 \n-> ");
		opc = entrada.nextInt();
		
		switch (opc){
			/*
			* 1. O custo de um carro novo ao consumidor é a soma do custo de 
			fábrica com a porcentagem do distribuidor e dos impostos 
			(aplicados ao custo de fábrica. Supondo que o percentual do 
			distribuidor seja de 28% e os impostos de 45%, escrever um 
			algoritmo para ler o custo de fábrica de um carro, calcular e 
			escrever o custo final ao consumidor.
			*/
	           
			case 1:
				double carro, custoFabrica,distribuidor = 0.28,impostos = 0.45;
				
				System.out.println("Digite o valor de fábrica do veículo: ");
				custoFabrica = entrada.nextDouble();
				
				carro = custoFabrica + (custoFabrica *distribuidor) + (custoFabrica *impostos);
	        
				System.out.printf("O valor final do veículo é: %.2f ",carro);
			break;
	            
			// Final da atividade 1
	           
			case 2:  //Inicio da atividade 2
				/**
				* 2. Faça um algoritmo para ler: a descrição do produto (nome),
				* a quantidade adquirida e o preço unitário. Calcular e 
				* escrever o total 
				* (total = quantidade adquirida * preço unitário), 
				* o desconto e o total a pagar 
				* (total a pagar = total - desconto), sabendo-se que:
				- Se quantidade <= 5 o desconto será de 2%
				- Se quantidade > 5 e quantidade <=10 o desconto será de 3%
				- Se quantidade > 10 o desconto será de 5%
				*/
	                
				System.out.println("Digite o nome do produto: ");
				String nome = entrada.next();
				int quantidade;
				double valorUnitario, total,desconto = 0;
				
				System.out.print("Informe a quantidade: ");
				quantidade = entrada.nextInt();
	                
				System.out.print("Qual é o valor unitário do produto: ");
				valorUnitario = entrada.nextDouble();
	                
				total = quantidade * valorUnitario;
	                                
				if(quantidade <= 5){
					desconto = 0.98;
				}else if( quantidade <= 10){
					desconto = 0.97;
				} else{
					desconto = 0.95;
					
				}
				System.out.printf("%d %s = R$%.2f",quantidade,nome,total*desconto);
	               
			break; //Fim da segunda questão
	            
			case 3: // Terceira questão
	                
				/**3. Faça um algoritmo que leia 20 números e, ao final, escreva 
				* quantos estão entre 0 e 100, quantos estão entre 101 e 200 e 
				* quantos são maiores de 200.**/
				
				int numero,cont1 = 0,cont2 = 0,cont3 = 0;
	                
				for(int i = 0; i < 20; i++){
					System.out.printf("Digite o %dª valor: ",i+1);
					numero = entrada.nextInt();
	                    
					if( numero < 100){
						cont1++;
					}else if(numero < 200){
						cont2++;
					}else{
						cont3++;
					}
	                    
				}
				System.out.printf("Foram digitados %d numeros menores que 100\n",cont1);
				System.out.printf("Foram digitados %d numeros maiores que 100 e menores que 200\n",cont2);
				System.out.printf("Foram digitados %d numeros maiores que 200\n",cont3);
			break;
	            
			case 4: // início da quarta questão
	                
				/*Escreva um algoritmo que leia uma sequência de números do 
				usuário e realize a soma desses números. Encerre a execução 
				quando um número negativo for digitado.*/
				
				int opc2,soma=0;
	                
				do{
					System.out.printf("Digite um valor positivo, ou um negativo para sair do programa \n -> ");
					opc2 = entrada.nextInt();
					if(opc2 >= 0){
						soma += opc2;
					}
				}while(opc2 >= 0);
			System.out.printf("O valor da soma é %d",soma);
	                
			break; // fim da quarta questão.
	           
	    }
	      
		entrada.close();

	}

}
