package main;

public class Funcionario extends Pessoa {
	
	private String matricula;
	private boolean isGerente = false;
	
	public Funcionario(String nome, long cpf) {
		super(nome, cpf);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isGerente() {
		return isGerente;
	}

	public void setGerente(boolean isGerente) {
		this.isGerente = isGerente;
	}

	

	
	
	

}
