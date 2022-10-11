

public abstract class Pessoa {
	
	private String nome;
    Data nascimento;
    
    public Pessoa(String nome2, Data data) {
	}
    public Pessoa(){
    	
    }

	public String getNome(){
        return this.nome;
    }
    
    public Data getData(){
        return this.nascimento;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setData(Data data){
        this.nascimento = data;
    }
    
    public abstract String imprimeDados();

}
