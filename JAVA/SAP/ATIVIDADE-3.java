/*03.Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor
B deverá ser a raiz quadrada do respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).(1 pontos)*/


import java.util.Scanner;
public class atividade3 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int[] a = new int[15];
		double[] b = new double[15];
		
		
		for (int i = 0; i < b.length; i++) {
			System.out.printf("Digite o %2d valor para o vetor: ",i+1);
			a[i] = entrada.nextInt();
			
			b[i] = Math.sqrt(a[i]);
		}
		System.out.println("VETOR A");
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]+". ");
			
		}
		System.out.println("\nVETOR B");
		for (int i = 0; i < b.length; i++) {
			
			System.out.printf("%.2f. ",b[i]);
		}
		
		
		
		
		entrada.close();
	}

}