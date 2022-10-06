package bytebank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo Primeira Conta: " + primeiraConta.saldo);
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo Segunda Conta: " + segundaConta.saldo);
		segundaConta.saldo += 100;
		System.out.println("Saldo Segunda Conta: " + segundaConta.saldo);
		System.out.println("Saldo Primeira Conta: " + primeiraConta.saldo);

		// Verificando se são i
		if(primeiraConta == segundaConta) {
			System.out.println("Verdade,");
		}
	}
}
