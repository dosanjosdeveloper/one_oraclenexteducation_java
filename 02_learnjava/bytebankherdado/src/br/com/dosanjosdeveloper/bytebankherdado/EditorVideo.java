package br.com.dosanjosdeveloper.bytebankherdado;

public class EditorVideo extends Funcionario {
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public double getBonificacao() {
		
		System.out.println("Bonifica��o de Editor de V�deo");
		return 150;
	}
}
