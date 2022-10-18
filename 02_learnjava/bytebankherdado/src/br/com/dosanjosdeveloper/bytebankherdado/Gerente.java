package br.com.dosanjosdeveloper.bytebankherdado;

public class Gerente extends FuncionarioAutenticavel {
	public double getBonificacao() {
		System.out.println("Chamando o Método de Bonificação do Gerente!!!");
		return super.getSalario();
	}
	
	/*
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
	
	*/
	
	
}
