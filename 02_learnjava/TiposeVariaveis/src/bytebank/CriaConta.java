package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println(primeiraConta.saldo);
		primeiraConta.saldo += 200;
		System.out.println(primeiraConta.saldo);
		Conta segundaConta = new Conta();
		segundaConta.saldo = 250.0;
		System.out.println(segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
	}
}
