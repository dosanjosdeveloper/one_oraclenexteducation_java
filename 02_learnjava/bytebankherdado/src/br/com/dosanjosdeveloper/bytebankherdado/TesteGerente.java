package br.com.dosanjosdeveloper.bytebankherdado;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marcus");
		g1.setCpf("888.999.888-66");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getSalario());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		boolean autenticou = g1.getAutentica(2222);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}

}
