package br.com.dosanjosdeveloper.bytebankherdado;

public abstract class FuncionarioAutenticavel extends Funcionario {
	private int senha;
	
	public abstract double getBonificacao();

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean getAutentica(int senha) {
		if (this.senha == 2222) {
			return true;
		}
		return false;
	}
}
