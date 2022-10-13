package br.com.dosanjosdeveloper.bytebankherdado;

public class Gerente extends Funcionario {
	
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean getAutentica(int senha) {
		if(this.senha == 2222){
			return true;
		}
		return false;
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
	
}
