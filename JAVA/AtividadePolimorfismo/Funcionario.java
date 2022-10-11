
public class Funcionario extends Pessoa{
	
	private float salario;
	
	Funcionario(){
		
	}
	Funcionario(String nome, Data data, float salario){
		super(nome,data);
		this.salario = salario;
		
	}
	
	public float getSalario() {
		return this.salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	public float calculaImposto(float salario) {
		
		float aux =0;
		aux = (float) (salario * 0.97);
		return aux;
	}
	
	
	@Override
	public String imprimeDados() {
		
		return String.format("\n\tFUNCIOANRIO \n"
				+ "NOME: %s\n"
				+ "SALARIO BRUTO R$%.2f\n"
				+ "SALARIO LIQUIDO %.2f\n"
				+ "DATA DE NASCIMENTO: %s \n\n" , this.getNome(),getSalario(),calculaImposto(salario),getData().dataFormatada());
	}

}
