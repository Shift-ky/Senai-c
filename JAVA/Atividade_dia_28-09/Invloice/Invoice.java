
public class Invoice {
	
	String numero;
	String descricao;
	int quantidade;
	double preco;
	
	public Invoice(int iniciaQuant,double valor){
		
		if( iniciaQuant > 0){
			quantidade = iniciaQuant;
		} else {
			quantidade = 0;
		}
		
		if(valor > 0.0){
			preco  = valor;
		} else {
			preco = 0.0;
		}
		
	}
	
	public void setQuant(int quantid){
		quantidade = quantid;
	}
	
	public void setNum(String numero){
		this.numero = numero;
	}
	public void setDesc(String descricao){
		this.descricao = descricao;
	}
	public void setPreco(Double valor){
		preco = valor;
	}
	
	public int getQuant(){
		return quantidade;
	}
	public String getNum(){
		return numero;
	}
	public String getDescricao(){
		return descricao;
	}
	public double getPreco(){
		return preco;
	}
	
	public double GetInvoiceAmount(){
		
		double total = quantidade * preco;
		
		return total;
		
	}
	

}
