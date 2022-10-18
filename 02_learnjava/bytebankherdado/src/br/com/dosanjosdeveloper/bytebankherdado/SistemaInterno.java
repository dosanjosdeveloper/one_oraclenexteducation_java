package br.com.dosanjosdeveloper.bytebankherdado;

public class SistemaInterno {
	private int senha = 222;
	public void autentica(FuncionarioAutenticavel g) {
		boolean autenticou = g.getAutentica(this.senha);
		if(autenticou) {
			System.out.println("Acesso Liberado!!!");
		}else {
			System.out.println("Acesso Negado!");
		}
	}
}
