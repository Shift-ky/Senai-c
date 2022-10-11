
public class Gerente extends Funcionario{

	
	private String area;
	CadastroPessoa cadastro;
	
	Gerente(){
		
	}
	Gerente(String nome, Data data, float salario, String area){
		super(nome, data,salario);
		this.area = area;
	}
	
	
	public String getArea() {
		return this.area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String imprimeDados() {
		
	return String.format("\tGERENTE\n"
			+ "NOME: %s\n"
			+ "Area: %s\n"
			+ "SALARIO BRUTO: R$%.2f\n"
			+ "SALARIO LIQUIDO: R$%.2f\n"
			+ "DATA DE NASCIMENTO: %s\n\n",this.getNome()
					    ,this.getArea()
					    ,this.getSalario()
					    ,this.calculaImposto(getSalario())
					    ,this.getData().dataFormatada());
	}
	
	@Override
	public float calculaImposto(float salario) {
		float aux;
		aux = (float) (salario*0.95);
		return aux;
	}
}
