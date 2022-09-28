package atividade2;

public class employeeteste {

	public static void main(String[] args) {
		
		String nome = "Robson";
		String sobrenome = "Paiva";
		double salario = 1200;
		
		Employee employee = new Employee(nome,sobrenome);
		String nome1 = "joao";
		String sobrenome1 = "ana";
		double salario1 = -100;
		employee.setSalario(salario);
		
		Employee employee2 = new Employee(nome1,sobrenome1);
		employee2.setSalario(salario1);
		
		
		System.out.println(employee.getNome()+" ");
		System.out.println(employee.getSobrenome()+" ");
		System.out.println(employee.getSalario());
		
		System.out.println(employee2.getNome()+" ");
		System.out.println(employee2.getSobrenome()+" ");
		System.out.println(employee2.getSalario());
		
		System.out.println("\nCom almento de 10 %\n");

		System.out.print(employee.getNome()+" ");
		System.out.print(employee.getSobrenome()+" ");
		System.out.println(employee.aumento());
		
		System.out.print(employee2.getNome()+" ");
		System.out.print(employee2.getSobrenome()+" ");
		System.out.println(employee2.aumento());
		
	}
}
