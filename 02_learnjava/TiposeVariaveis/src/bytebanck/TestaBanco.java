package bytebanck;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "888.888.888-88";
		paulo.profissao = "ADS";
		
		Conta contaPaulo = new Conta();
		contaPaulo.deposta(100);
		
		contaPaulo.titular = paulo;
		System.out.println(contaPaulo.titular.nome);
	}
}
