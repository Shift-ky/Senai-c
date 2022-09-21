import java.util.Scanner;

public class atividade5 {
	
	
    public static double somaTotal(double a, double b, double c){ // Início da função da primeira atividade
        double carro = a + (a *b) + (a *c);						
        return carro;
        
    } // Fim da primeira função
    
    public static double desconto(int quant){ // Inicio da segunda função
        double desconto;                    
        if(quant <= 5){
            desconto = 0.98;
        }else if( quant <= 10){
            desconto = 0.97;
        } else{
            desconto = 0.95;
                    
        }

        return desconto;
    } // Fim da segunda função
    
    public static void contador(){  // Iníco da terceira atividade
    	
        Scanner entrada = new Scanner(System.in);
        int cont1 = 0, cont2 = 0,cont3 = 0,x;
        for(int i = 0; i < 20; i++){
            System.out.printf("Digite o %dª valor: ",i+1);
            x = entrada.nextInt();
                    
            if( x < 100){
                cont1++;
            }else if(x < 200){
                cont2++;
            }else{
                cont3++;
            }
                    
        }
        entrada.close();
        
       System.out.println("Foram digitados "+cont1+ "Numero menores que 100\n"+
        "Foram digitados "+cont2+" numeros entre 100 e 200 \n"+
        "Foram digitados "+cont3+" numeros acima de 200\n");
    } // fim da terceira função
    
    public static void soma() {   //função da quarta atividade
        int opc2,soma=0;
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.printf("Digite um valor positivo, ou um negativo para sair do programa \n -> ");
            opc2 = entrada.nextInt();
            if(opc2 >= 0){
                soma += opc2;
            }
        }while(opc2 >= 0);
        System.out.printf("O valor da soma é %d",soma);
        
        entrada.close();
    } // fim da função da quarta atividade
    
    public static void main(String[] args) {
        
        int opc =0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escolha uma atividade");
        System.out.printf("[1] - Atividade 1 \n[2] - Atividade 2 \n"
        + "[3] - Atividade 3 \n[4] - Atividade 4 \n-> ");
        opc = entrada.nextInt();
        
        switch(opc){
            case 1:
                double custoFabrica,distribuidor = 0.28,impostos = 0.45;

                System.out.println("Digite o valor de fábrica do veículo: ");
                custoFabrica = entrada.nextDouble();

                double custoCarro = somaTotal(custoFabrica, distribuidor, impostos);
                System.out.printf("O valor total do veículo é: %f",custoCarro);

            break;
            
            case 2:
                System.out.println("Digite o nome do produto: ");
                String nome = entrada.next();
                int quantidade;
                double valorUnitario, total,desconto = 0;
                
                System.out.print("Informe a quantidade: ");
                quantidade = entrada.nextInt();
                
                System.out.print("Qual é o valor unitário do produto: ");
                valorUnitario = entrada.nextDouble();
                
                total = quantidade * valorUnitario;
                desconto = desconto(quantidade);
                System.out.printf("%d unidades de %s é R$ %.2f",quantidade,nome,total*desconto);
            break;
            
            case 3:
                /**3. Faça um algoritmo que leia 20 números e, ao final, escreva 
                 * quantos estão entre 0 e 100, quantos estão entre 101 e 200 e 
                 * quantos são maiores de 200.**/
      
                contador();
                
            break;
            
            case 4:
            	soma();
            	
            break;
            	
            
        
        }
        entrada.close();
    }
    
}
