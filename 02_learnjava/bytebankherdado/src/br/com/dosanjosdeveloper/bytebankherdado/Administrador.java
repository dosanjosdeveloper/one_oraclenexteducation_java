package br.com.dosanjosdeveloper.bytebankherdado;

public class Administrador extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
		return 50;
	}
	/*
	 * private int senha;
	 * 
	 * public void setSenha(int senha) { this.senha = senha; }
	 * 
	 * public boolean getAutentica(int senha) { if(this.senha == 3333){ return true;
	 * } return false; }
	 */
}
