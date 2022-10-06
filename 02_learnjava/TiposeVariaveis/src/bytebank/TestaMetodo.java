package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaPaulo = new Conta();
		contaPaulo.saldo = 100;
		contaPaulo.deposta(50);
		System.out.println(contaPaulo.saldo);
		contaPaulo.saca(20);
		System.out.println(contaPaulo.saldo);
		boolean conseguiuRetirar = contaPaulo.saca(0);
		System.out.println(conseguiuRetirar);
		System.out.println(contaPaulo.saldo);
		
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposta(1000);
		
		
		if(contaMarcela.transfere(600, contaPaulo)) {
			System.out.println("Transferência realizada com sucesso!!");
			System.out.println("Novo Saldo:");
			System.out.println("Conta Marcela: "+contaMarcela.saldo);
			System.out.println("Conta Paulo: "+contaPaulo.saldo);			
		}else {
			System.out.println("Saldo insuficiente!!!");
		}
		
		contaPaulo.titular = "Paulo Silveira";
		
		
	}
}
