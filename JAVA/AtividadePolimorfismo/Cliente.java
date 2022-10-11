
public class Cliente extends Pessoa{
	
	private int codigo;
	
	Cliente(){
		
	}
	Cliente(String nome, Data data, int codigo){
		super(nome, data);
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	@Override
	public String imprimeDados() {
		return String.format("\tCLIENTE\n"
				+ "NOME: %s\n"
				+ "CÓDIGO: %d\n"
				+ "DATA DE NASCIMENTO %s\n",getNome()
							             ,getCodigo()
							             ,getData().dataFormatada());
	}

}
