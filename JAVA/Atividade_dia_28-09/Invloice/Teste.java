import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digita o número: ");
		String number = entrada.nextLine();
		
		System.out.println("Digita a descrição do produto: ");
		String desc = entrada.nextLine();
		
		System.out.println("Quantidade do produto do pedido:");
		int quant = entrada.nextInt();
		
		System.out.println("Valor por um item");
		double valor = entrada.nextDouble();
		
		 Invoice invoice = new Invoice( quant, valor);
		
		invoice.setNum(number);
		invoice.setDesc(desc);
		
		System.out.println("Número: "+invoice.getNum()+
							"\nDescrição: "+invoice.getDescricao()+
							"\nQuantidade: "+invoice.getQuant()+
							"\nValor: "+invoice.getPreco());
		System.out.println();
		
		System.out.println("O Valor total é "+invoice.GetInvoiceAmount());
		
		
		entrada.close();
	}

}
