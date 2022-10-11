import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {
	
	  	private int qtdAtual;
	  	List<Pessoa> pessoa = new ArrayList<>();
	    
	    public int getQtdAtual(){
	        return this.qtdAtual;
	    }
	    
	    public void setQtdAtual(int quantidade){
	        this.qtdAtual = quantidade;
	    }
	    
	    
	    public void cadastraPessoa(Pessoa pess){
	    	this.pessoa.add(pess);
	        
	    }
	    
	    public String imprimeCadastro(){
	    	String aux = "";
	    	for (Pessoa pessoa2 : pessoa) {
				aux += pessoa2.imprimeDados();
			}
	    	return aux;
	    }
	    

}
