
public class Data {
	    
	    private int dia;
	    private int mes;
	    private int ano;
	    CadastroPessoa cadastro;
	    
	    Data(){
	    	
	    }
	    Data(int dia, int mes, int ano){
	    	this.dia = dia;
	    	this.mes = mes;
	    	this.ano = ano;
	    	
	    }
	    
	    public String dataFormatada() {
	    	return this.dia + "/"+this.mes+"/"+this.ano;
	    }

}
