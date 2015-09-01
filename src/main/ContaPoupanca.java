package main;

public class ContaPoupanca implements Conta {
	
	public ContaPoupanca (){
		
	}

	private double saldo;

	@Override
	public void depositar(double valor) {
		this.saldo += valor;

	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;

	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [saldo=" + saldo + "]";
	}
	
	

}
