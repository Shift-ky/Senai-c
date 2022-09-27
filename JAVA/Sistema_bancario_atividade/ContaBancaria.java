package AgenciaBancaria;

public class ContaBancaria {
	
	String nome;
	double saldo = 1000;
	double limite = 500;
	double aux = saldo*(-1);
	double aux1;
	double aux3;
	
	
	ContaBancaria(){
		
	}
	
	ContaBancaria(String nome, double saldo){
		this.nome = nome;
		
		if(saldo < 0) {
			this.saldo = 0.0;
		}else {
			this.saldo = saldo;
		}
		
	}
	
	void depositar(double valor){
		aux = this.saldo;
		this.saldo += valor;
		if(this.limite <500) {
			this.limite -= aux;
			System.out.println("Deposito realizado com sucesso!");
		}
		
	}
	 
	void sacar(double valor){
		if(this.saldo == 0 && valor <= limite){
			aux1 = valor;
			this.limite -= valor;
			this.saldo += aux1*(-1);
			System.out.println("Saque realizado com sucesso!");
		}else if(valor > 0 && valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
		}else if(this.saldo + this.limite >= valor) {
			aux3 = saldo - valor;
			this.saldo -= valor;
			this.limite += aux3;
			System.out.println("Saque realizado com sucesso!");
			
		}else {
			System.out.println("Saldo insulficiente");
		}
		
	}

}
