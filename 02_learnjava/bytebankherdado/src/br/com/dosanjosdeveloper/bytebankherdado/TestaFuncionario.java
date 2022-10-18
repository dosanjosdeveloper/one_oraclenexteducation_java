package br.com.dosanjosdeveloper.bytebankherdado;

public class TestaFuncionario {
	public static void main(String[] args) {
		Gerente nico = new Gerente();
		nico.setNome("Lelele");
		nico.setCpf("789.321.369-96");
		nico.setSalario(2600.00);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		
	}
}
